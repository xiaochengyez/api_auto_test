package unit;

import org.junit.jupiter.api.Test;
import utils.CopyTemplate;

import java.util.HashMap;

public class TestCopyTemplate {
    @Test
    public void testCopy(){
        CopyTemplate template = new CopyTemplate();
        HashMap<String,Object> data = new HashMap<>();

        System.out.println(template.template("api/get_temp.yaml", data));
    }
}
