package spring10Zuoye01;

public class StudentEL {
    private String name;
    private int age;
    private String friendName;
    private String clazz;
    private Double score;
    private String Dbla;

    @Override
    public String toString() {
        return "StudentEL{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName='" + friendName + '\'' +
                ", clazz='" + clazz + '\'' +
                ", score=" + score +
                ", Dbla='" + Dbla + '\'' +
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

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDbla() {
        return Dbla;
    }

    public void setDbla(String dbla) {
        Dbla = dbla;
    }
}
