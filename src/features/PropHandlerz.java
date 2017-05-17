package features;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropHandlerz {
    public static String Filepath=System.getProperty("user.dir")+"\\OR.properties";
    public static Properties OR;
    public static InputStream IO;

    public static String fetchProp(String key){


        OR= new Properties();

        try {
            IO=new FileInputStream(Filepath);
            OR.load(IO);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String value=OR.getProperty(key);
        return value;

    }

}