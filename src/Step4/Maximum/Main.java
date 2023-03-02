package Step4.Maximum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int conut = 0;
        for (int i = 0; i < 9; i++) {
            int array = Integer.parseInt(br.readLine());
            if (array > max) {
                max = array;
                conut = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(conut);
    }
}

