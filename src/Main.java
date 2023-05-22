import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r, a;
        double alan, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        a = input.nextInt();

        alan = (pi * (r * r) * a) / 360;
        System.out.print("Daire diliminin alanı: " + alan);
    }
}