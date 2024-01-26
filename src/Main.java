import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String bludo = "шарлотка";
        System.out.println("Блюдо: "+bludo);
        char o = '-';

        String egg = "Яйцо";
        String muka = "Мука";
        String sugar = "Сахар";
        String apple = "Яблоко";
        String soda = "Сода";

        System.out.println(egg + " введите количество: ");
        Integer colEgg = scanner.nextInt();

        System.out.println(muka + " введите количество грамм: ");
        Integer colMuka = scanner.nextInt();

        System.out.println(sugar + " введите количество грамм: ");
        Integer colSugar = scanner.nextInt();

        System.out.println(apple + " введите количество: ");
        Integer colApple = scanner.nextInt();

        System.out.println(soda + " введите количество грамм: ");
        Integer colSoda = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Введите способ приготовления: ");
        var recept = scanner.nextLine();


        PrintWriter printWriter = new PrintWriter("pr1.txt");
        printWriter.println("Блюдо: "+bludo);
        printWriter.println("Ингредиенты:");
        printWriter.println(egg + o + colEgg);
        printWriter.println(muka + o + colMuka);
        printWriter.println(sugar + o + colSugar);
        printWriter.println(apple + o + colApple);
        printWriter.println(soda + o + colSoda);

        printWriter.println("Способ приготовления:");
        printWriter.println(recept);

        printWriter.close();

    }
}