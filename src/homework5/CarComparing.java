package homework5;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class CarComparing {
    public static void main(String[] args) {

        // сортировать по значениям свойств: price, color, brand

        Car blackOpel = new Car("black", "opel", 2000);
        Car redOpel = new Car("red", "opel", 2500);
        Car yellowMazda = new Car("yellow", "mazda", 3000);
        Car greenMazda = new Car("green", "mazda", 3000);

        Comparator<Car> comparator= new Car.PriceComparator()
                .thenComparing(new Car.ColorComparator())
                .thenComparing(new Car.BrandComparator());
        TreeSet<Car> CarTreeSet = new TreeSet<>(comparator);
        CarTreeSet.add(blackOpel);
        CarTreeSet.add(redOpel);
        CarTreeSet.add(yellowMazda);
        CarTreeSet.add(greenMazda);

        System.out.print(CarTreeSet);

    }
}