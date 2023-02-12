import java.util.Scanner;

public class Main {
    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrice = inputBookPrice() ;
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, bookPrice);
            //todo использовать новый метод тут
            printInfo();
        }
    }

    public static double inputBookPrice() {
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextDouble();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }


    public static void addBook(String bookName, int pageCount) {
       addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrice) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр " + "-" + (bookPrice > 0.0 ? bookPrice + " рублей " : " Не Установлено ") + "\n";
    }


    public static void printInfo()    {
        System.out.println(booksInfo);
    }

}
