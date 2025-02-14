import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Man> manSupplier = () -> {
            System.out.println("Введите имя человека: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Введите возраст человека: ");
            int age = new Scanner(System.in).nextInt();
            System.out.println(("Введите рост человека: "));
            int height = new Scanner(System.in).nextInt();

            return new Man(name, age, height);
        };



        Predicate<Integer> isAdult = (age) -> age >= 18;

        Man man1 = manSupplier.get();
        Man man2 = manSupplier.get();



        System.out.println("Человек 1 совершеннолетний? " + isAdult.test(man1.getAge()));
        System.out.println("Человек 2 совершеннолетний? " + isAdult.test(man2.getAge()));



    }
}