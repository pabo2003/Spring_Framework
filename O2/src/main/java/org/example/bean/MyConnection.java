package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*public class MyConnection implements DisposableBean {
    public MyConnection() {
        System.out.println("My connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My connection destroy");
    }
}*/

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My connection ApplicationContextAware");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("My connection BeanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My connection BeanFactoryAware");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My connection InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My connection DisposableBean");
    }

    public MyConnection() {
        System.out.println("My connection");
    }
}


