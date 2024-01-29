import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        System.out.println("bean и bean1 равны? " + (bean == bean1));

        Cat cat = (Cat) applicationContext.getBean("catBean");
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        System.out.println("cat и cat1 равны? " + (cat == cat1));

        System.out.println(cat);
        System.out.println(cat1);
    }
}