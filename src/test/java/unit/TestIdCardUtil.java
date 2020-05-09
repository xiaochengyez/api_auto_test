package unit;

import org.junit.jupiter.api.Test;
import utils.IdCardUtil;
import utils.RegisterLocationUtil;

import java.util.HashMap;

public class TestIdCardUtil {
    @Test
    void idCard(){
        HashMap<String,Integer> register = new HashMap<>();
        register.put("黄骅市", 130983);
        register.put("北京市", 110000);
        System.out.println(IdCardUtil.verificationCode("21032119950808319"));
        System.out.println(IdCardUtil.randomBirthday());
        System.out.println(IdCardUtil.randomCode());
        System.out.println(IdCardUtil.randomLocationCode(register));
        System.out.println(IdCardUtil.getIdCard());
    }
}
