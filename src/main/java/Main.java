import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args){

        List<Cat> cats = new ArrayList<>();

        Cat simba = new Cat("Simba", "Abyssinian", 3.2);
        Cat loki = new Cat("Loki", "Maine Coon", 5.7);
        Cat kitty = new Cat("Kitty", "Persian", 1.9);
        Cat tom = new Cat("Tom", "Siamese", 7.5);

        cats.add(simba);
        cats.add(loki);
        cats.add(kitty);
        cats.add(tom);

        Comparator ageComparator = new MinAge();
        Collections.sort(cats, ageComparator);
        System.out.println(cats);
    }
}
