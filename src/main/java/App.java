import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondBeanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBeanHelloWorld.getMessage());
        // ------ вызов Бина Cat (@Scope "prototype") -------- //
        Cat firstBeanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(firstBeanCat.getMessage());
        Cat secondBeanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondBeanCat.getMessage());
        // ------ сравнение бинов по ссылкам ----------------- //
        System.out.println(bean == secondBeanHelloWorld);
        System.out.println(firstBeanCat == secondBeanCat);
    }
}