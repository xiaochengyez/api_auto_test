package model;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class ApiObjectModelMethod {
    private Map<String, Object> headerParams;
    private Map<String, Object> bodyParams;
    private Map<String, Object> params;
    private Map<String, Object> header;
    private Map<String, Object> query;
    private Map<String, Object> postBody;
    private String postBodyRaw;
    private String method = "get";
    private String url = "";

    public Response toRequest() {
        RequestSpecification request = given();
        if (header != null) {
            if (null != headerParams) {
                header.putAll(headerParams);
            }

            header.entrySet().forEach(entry -> {
                request.header(entry.getKey(), replace(entry.getValue()));
            });
        }

        if (query != null) {
            if (null != bodyParams) {
                query.putAll(bodyParams);
            }
            query.entrySet().forEach(entry -> {
                request.queryParam(entry.getKey(), replace(entry.getValue()));
            });
        }

        if (postBody != null) {
            if (null != bodyParams) {
                postBody.putAll(bodyParams);
            }
            postBody.entrySet().forEach(entry -> {
                postBody.put(entry.getKey(), replace(entry.getValue()));
            });
            request.body(postBody);
        }

        if (postBodyRaw != null) {
            request.body(replace(postBodyRaw));
        }

        return request
                .when().log().all().request(method, url)
                .then().log().all().extract().response();
    }

    public Object replace(Object raw) {
        if (null != params) {
            for (Map.Entry<String, Object> kv : params.entrySet()) {
                String matcher = "${" + kv.getKey() + "}";
                if (raw.toString().contains(matcher)) {
                    raw = raw.toString().replace(matcher, kv.getValue().toString());
                }
            }
        }
        return raw;
    }

    public Response toRun(Map<String, Object> params, Map<String, Object> headerParams, Map<String, Object> bodyParams) {
        this.headerParams = headerParams;
        this.bodyParams = bodyParams;
        this.params = params;
        return toRequest();
    }

    public void setHeader(Map<String, Object> header) {
        this.header = header;
    }

    public void setQuery(Map<String, Object> query) {
        this.query = query;
    }

    public void setPostBody(Map<String, Object> postBody) {
        this.postBody = postBody;
    }

    public void setPostBodyRaw(String postBodyRaw) {
        this.postBodyRaw = postBodyRaw;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

