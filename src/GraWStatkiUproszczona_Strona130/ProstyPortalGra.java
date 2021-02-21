package GraWStatkiUproszczona_Strona130;

import java.util.Random;
import java.util.Scanner;

public class Portal {

    public static void main(String[] args) {
        int ilośćRuchówGracza = 0;

        Random polePolozeniaPortalu = new Random();
        System.out.println(polePolozeniaPortalu.nextInt(4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbę:");
        int strzalUżytkownika = scanner.nextInt();
    }
}
