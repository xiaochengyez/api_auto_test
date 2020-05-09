package Integrate;

import api.BaiduApi;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.HashMap;

public class TestBaiduApi {
    private static BaiduApi baiduApi;
    @BeforeAll
    static void  createUserActivity(){
        baiduApi = new BaiduApi();
    }


    @Test
    void testSearch(){
        baiduApi.search().then().statusCode(200);
    }

}
