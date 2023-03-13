package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigData {

    public static void main(String[] args) throws Exception {

       FileInputStream fis = new FileInputStream("./data/config.properties");
       Properties prop = new Properties();
       prop.load(fis);
       String url = prop.getProperty("appURL");
       String urlprod = prop.getProperty("appURL_prod");
        
       System.out.println("Application URL: " + url);

       System.out.println("Application URL prod: " + urlprod);
        

       

        

        

        

        

        

     



    }









}

