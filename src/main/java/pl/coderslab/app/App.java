package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger bean = context.getBean(SimpleCustomerLogger.class);
        bean.log();


    }
}
