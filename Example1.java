package Properties;

import java.io.FileReader;
import java.util.Properties;

//Example of properties class to get information from the properties file
public class Example1 {

    public static void main(String[] args) throws Exception{

        FileReader reader = new FileReader("C:\\Program Files (J)\\CoreJava\\src\\Properties\\test.properties");
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}
