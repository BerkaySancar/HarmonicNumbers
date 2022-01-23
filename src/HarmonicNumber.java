import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("-------             Harmonic Numbers              -------");
        System.out.println("-----Harmonic Series Formula =  (1/1) + (1/2) + (1/3) + ... + (1/n)-----");
        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        System.out.println("Result = " + result);
    }
}
