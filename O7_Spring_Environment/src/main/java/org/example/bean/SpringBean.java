package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean{
    @Value("${os.name}")
    private String osName;

    @Value("${java.version}")
    private String javaVersion;

    @Value("${user.name}")
    private String userName;

    @Value("${db.user}")
    private String dbUser;

    @Value("${db.password}")
    private String dbPassword;


    public SpringBean() {
        System.out.println("Spring Bean Constructor");
        System.out.println(osName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(javaVersion);
        System.out.println(userName);
        System.out.println(dbUser);
        System.out.println(dbPassword);
    }
}
