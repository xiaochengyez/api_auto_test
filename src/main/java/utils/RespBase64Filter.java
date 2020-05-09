package utils;
import io.restassured.builder.ResponseBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import java.util.Base64;
public class RespBase64Filter implements Filter{
    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        Response resOrigin = ctx.next(requestSpec,responseSpec);
        ResponseBuilder responseBuilder = new ResponseBuilder().clone(resOrigin);
        String tmpDecodeContent = new String(
                Base64.getDecoder().decode(
                        resOrigin.body().asString().trim()
                )
        );
        responseBuilder.setBody(tmpDecodeContent);
        Response resNew = responseBuilder.build();
        return resNew;
    }
}
