package org.example;

import org.example.bean.MyConnection;
import org.example.bean.TestBean1;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitialize {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*TestBean1 bean1 = context.getBean(TestBean1.class);
        System.out.println(bean1);*/

       /* TestBean1 testBean1 = context.getBean(TestBean1.class);
        TestBean1 testBean2 = context.getBean(TestBean1.class);

        System.out.println(testBean1);
        System.out.println(testBean2);

        MyConnection myConnection = context.getBean(MyConnection.class);
        MyConnection myConnection1 = context.getBean(MyConnection.class);

        System.out.println(myConnection);
        System.out.println(myConnection1);
*/


        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println("---------------------------------------------------------------");

        MyConnection myConnection1 = context.getBean(MyConnection.class);


        context.registerShutdownHook();
    }
}
