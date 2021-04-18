package homework5;

import java.util.Comparator;
import java.util.Objects;

public class Car {
    private String color;
    private String brand;
    private int price;

    public Car(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price && color.equals(car.color) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, price);
    }

    public static class PriceComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return Integer.compare(o1.price, o2.price);
        }
    }

        public static class ColorComparator implements Comparator<Car> {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.color.compareToIgnoreCase(o2.color);
            }
        }

            public static class BrandComparator implements Comparator<Car> {
                @Override
                public int compare(Car o1, Car o2) {
                    return o1.brand.compareToIgnoreCase(o2.brand);
                }
            }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}


