package springZhujieZuoYe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBean {
    @Value("#{pro.name}")
    private String name;
    @Value("#{pro.age}")
    private int age;
    @Value("#{pro.Hobby}")
    private String Hobby;

    @Override
    public String toString() {
        return "DataBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Hobby='" + Hobby + '\'' +
                '}';
    }
}
