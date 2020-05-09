package unit;

import org.junit.jupiter.api.Test;
import utils.MyTimeUtil;


public class TestTimeUtil {
    @Test
    void testTime(){
        System.out.println(MyTimeUtil.timeDate());
        System.out.println(MyTimeUtil.getNewDate(1));
        System.out.println(MyTimeUtil.getTimestamp());
        System.out.println(MyTimeUtil.getNow("20200314170328"));
    }
}
