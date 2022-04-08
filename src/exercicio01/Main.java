package exercicio01;

//Dividir um byte em dois números

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int input = 0b10101111;
        int left = input >> 4;
        int mask = 0b00001111;
        int right = input & mask;

        System.out.println(input);
        System.out.println("left: " + left);
        System.out.println("right: " + right);
    }
}
