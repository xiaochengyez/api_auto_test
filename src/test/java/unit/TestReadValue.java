package unit;

import api.BaseApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import model.ApiObjectModel;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class TestReadValue {
    @Test
    public void testReadValue(){
        String method = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(method);
        String path = "/" + this.getClass().getCanonicalName().replace('.', '/') + ".yaml";
        System.out.println(path);
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        ApiObjectModel model = new ApiObjectModel();
        try {
            model = mapper.readValue(
                    TestReadValue.class.getResourceAsStream(path), model.getClass()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(model.getMethods());
    }

    @Test
    public void testReadYaml() throws IOException {
        ObjectMapper mapper=new ObjectMapper(new YAMLFactory());
        Object[][] demo=mapper.readValue(this.getClass().getResourceAsStream("/unit/demo.yaml"),
                Object[][].class);
        System.out.println(demo);

    }
    @Test
    public void testRead(){
        ObjectMapper mapper =new ObjectMapper(new YAMLFactory());

        ApiObjectModel model = new ApiObjectModel();
        try {
            model = mapper.readValue(
                    TestReadValue.class.getResourceAsStream("/unit/TestReadValue.yaml"), model.getClass()
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(model.getMethods());
        //System.out.println(model.getMethods().get("get").toRequest());
        System.out.println(model.getMethods().get("get").toString());



    }
}
