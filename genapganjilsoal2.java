package latihanukl;
//latihan utk menentukan bilangan genap atau ganjil
//soal mudah 2
import java.util.Scanner;
public class genapganjilsoal2 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan : ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan Genap.");
        } else {
            System.out.println(number + " adalah bilangan Ganjil.");
        }
        input.close();
    }
}
