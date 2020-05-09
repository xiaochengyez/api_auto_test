package api;

import io.restassured.response.Response;

import java.util.HashMap;

public class BaiduApi extends BaseApi{
    public Response search() {
        return parseSteps();
    }


}
