package demo.src.main.java.com.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fibSequence seq = new fibSequence();
        Scanner input = new Scanner(System.in);
        System.out.print("Number of terms for fibonacci sequence: ");
        int inputValue = input.nextInt();
        System.out.println(seq.sequence(inputValue));
        input.close();
    }
    
}
