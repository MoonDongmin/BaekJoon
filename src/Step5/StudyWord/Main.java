package Step5.StudyWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();

        int[] array = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int num = a.charAt(i) - 'A';
            array[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                answer = (char) (i + 'A');
            } else if (max == array[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
