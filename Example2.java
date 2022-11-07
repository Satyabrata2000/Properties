package Properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//Example of properties class to get all the system properties
public class Example2 {

    public static void main(String[] args) {
        Properties p = System.getProperties();
        Set set = p.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }
    }
}
