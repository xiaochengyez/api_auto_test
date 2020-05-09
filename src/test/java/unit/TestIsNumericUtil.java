package unit;

import org.junit.jupiter.api.Test;
import utils.IsNumericUtil;

public class TestIsNumericUtil {
    @Test
    void testNumber(){
        System.out.println(IsNumericUtil.isNumeric("828773v"));
    }
    @Test
    void testNumberTrue(){
        System.out.println(IsNumericUtil.isNumeric("828773"));
    }
    @Test
    void testNumber1(){
        System.out.println(IsNumericUtil.isNumeric("-8.28773"));
    }
    @Test
    void testNumber2(){
        System.out.println(IsNumericUtil.isNumeric(".-28773"));
    }
    @Test
    void testNumber3(){
        System.out.println(IsNumericUtil.isNumeric("."));
    }
    @Test
    void testNumber4(){
        System.out.println(IsNumericUtil.isNumeric("-0"));
    }
}
