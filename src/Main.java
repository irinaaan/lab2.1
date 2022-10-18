import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Item Book = new Item("History of Ukraine", 200);

        System.out.println("Введите свою цену на товар: ");
        Book.price = in.nextFloat();

        System.out.println("\nВведите процент, на который Вы хотите увеличить цену: ");
        float percent = in.nextFloat();
        System.out.println("Новая цена товара: " + Book.priceIncrease(Book.price, percent));

        System.out.println("\nВведите процент, на который Вы хотите уменьшить цену: ");
        percent = in.nextFloat();
        System.out.println("Новая цена товара: " + Book.priceDrop(Book.price, percent));
    }
}
