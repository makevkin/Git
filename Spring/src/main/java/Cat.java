import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
public class Cat {
    private String name;

    public Cat() {
        System.out.println("Cat is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}