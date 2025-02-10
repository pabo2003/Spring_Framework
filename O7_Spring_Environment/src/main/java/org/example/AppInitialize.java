package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        //System environment variables are stored in a Map<String, String> called System.getenv()
        Map<String, String> env = System.getenv();
       /* for (String key : env.keySet()){
            System.out.println(key+": "+env.get(key)  );
        }*/

//        System.out.println(env.get("PROCESSOR_LEVEL"));





        //Access Predefined Properties from java
        Properties properties = System.getProperties();
        /*for (String key : properties.stringPropertyNames()){
            System.out.println(key+": "+env.get(key)  );
        }*/
//        System.out.println(System.getProperty("os.name"));




        context.registerShutdownHook();
    }
}
