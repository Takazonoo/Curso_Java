package Exercicio_estrutura_condicional;

import java.util.Scanner;

public class Mainexerc02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPART");
        }

        sc.close();
    }
}
