package org.example;

import org.example.bean.*;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*SpringBean springBean = context.getBean(SpringBean.class);
        springBean.sayHello();

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);
*/
        /*Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutting Down");
                context.close();
            }
        });*/
        context.registerShutdownHook();

        /*TestBean3 teasBean3 = context.getBean(TeasBean3.class);
        System.out.println(teasBean3);*/

        /*Object bean = context.getBean("bean");
        System.out.println(bean);

        Object bean1 = context.getBean("testBean1");
        System.out.println(bean1);

        Object bean2 = context.getBean("testBean2");
        System.out.println(bean2);

        Object bean3 = context.getBean("teasBean3");
        System.out.println(bean3);*/

       /* MyConnection connection = context.getBean(MyConnection.class);
        System.out.println(connection);*/

        /*MyConnection connection = (MyConnection) context.getBean("bean1");
        System.out.println(connection);*/
        TestBean1 bean = context.getBean(TestBean1.class);
        System.out.println(bean);

        TestBean1 bean1 = context.getBean(TestBean1.class);
        System.out.println(bean1);

        TestBean1 bean2 = context.getBean(TestBean1.class);
        System.out.println(bean1);

        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        System.out.println(myConnection1



        );

    }
}
