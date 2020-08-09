package cl.tbd.ejemplomongodb;
import org.springframework.data.annotation.Id;
public class Dog{
    
    @Id private String id;
    private String name;
    private int age;
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
}