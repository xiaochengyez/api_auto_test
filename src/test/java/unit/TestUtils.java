package unit;

import org.junit.jupiter.api.Test;
import utils.FileUtil;
import utils.StringUtil;

public class TestUtils {
    @Test
    void testStringUtil(){
        System.out.println(StringUtil.replaceFirst("abcdefg", "e", "3333"));
    }

    @Test
    void testReadYaml(){
        System.out.println(FileUtil.readYaml(""));
        System.out.println();

    }
}
