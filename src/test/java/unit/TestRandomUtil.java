package unit;

import org.junit.jupiter.api.Test;
import utils.RandomUtil;

public class TestRandomUtil {
    @Test
    void testRandomUtil(){
        System.out.println(RandomUtil.getRandom(10, false));
    }
    @Test
    void testOnlyN(){
        System.out.println(RandomUtil.getRandom(10, true));
    }
}
