package spring10Zuoye01;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String name;
    private int age;
    private List<String> friendName;
    private Set<String> clazz;
    private Map<String,Double> score;
    private Properties Dbla;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName=" + friendName +
                ", clazz=" + clazz +
                ", score=" + score +
                ", Dbla=" + Dbla +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriendName() {
        return friendName;
    }

    public void setFriendName(List<String> friendName) {
        this.friendName = friendName;
    }

    public Set<String> getClazz() {
        return clazz;
    }

    public void setClazz(Set<String> clazz) {
        this.clazz = clazz;
    }

    public Map<String, Double> getScore() {
        return score;
    }

    public void setScore(Map<String, Double> score) {
        this.score = score;
    }

    public Properties getDbla() {
        return Dbla;
    }

    public void setDbla(Properties dbla) {
        Dbla = dbla;
    }
}
