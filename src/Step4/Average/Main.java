package Step4.Average;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double array[] = new double[a];
        double sum = 0;

        for (int i = 0; i < a; i++) {
            array[i] = in.nextDouble();
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            sum += ((array[i] / array[array.length - 1]) * 100);
        }
        System.out.print(sum / a);
    }
}

