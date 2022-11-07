package Properties;

import java.io.FileWriter;
import java.util.Properties;

//Example of properties class to create the properties file
public class Example3 {

    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("abc", "123");
        p.setProperty("xyz", "234");
        p.store(new FileWriter("C:\\Program Files (J)\\CoreJava\\src\\Properties\\info.properties"), "This is test content");
    }
}
