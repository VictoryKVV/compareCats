public class Cat implements Comparable<Cat>{
    private String name;
    private String breed;
    private double age;

    public Cat(String name, String breed, double age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    @Override
    public int compareTo(Cat o) {
        return (int)(this.getAge() - o.getAge());
    }

    private double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", порода: " + breed + ", возраст: " + age;
    }
}
