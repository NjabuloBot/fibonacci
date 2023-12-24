package demo.src.main.java.com.fibonacci;
import java.util.Scanner;

public class numberSeries {
    public int numSeries(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Number of terms in fibonacci series: ");
            int numTerms = scan.nextInt();
            return numTerms;
        }
    }
}
