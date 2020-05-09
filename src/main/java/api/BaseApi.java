package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.restassured.response.Response;
import model.ApiObjectModel;

import java.io.IOException;
import java.util.Map;

public class BaseApi {
    private Map<String, Object> headerParams;
    private Map<String, Object> bodyParams;
    private Map<String, Object> params;

    public Response parseSteps() {
        //方法名
        String method = Thread.currentThread().getStackTrace()[2].getMethodName();
        String path = "/" + this.getClass().getCanonicalName().replace('.', '/') + ".yaml";
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ApiObjectModel model = new ApiObjectModel();
        try {
            model = mapper.readValue(
                    BaseApi.class.getResourceAsStream(path), model.getClass()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model.getMethods().get(method).toRun(params,headerParams,bodyParams);
    }

    public void setHeaderParams(Map<String, Object> headerParams) {
        this.headerParams = headerParams;
    }

    public void setBodyParams(Map<String, Object> bodyParams) {
        this.bodyParams = bodyParams;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
