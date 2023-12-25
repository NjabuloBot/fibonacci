package demo.src.main.java.com.fibonacci;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number of terms for fibonacci series: ");
            int nTerms = scan.nextInt();
            if (nTerms <=0){System.out.println("Term value must be > 0.");continue;}
            else{
                int numTerms = numSeries(nTerms);
                
            } 
        }
    }


    static int numSeries(int terms){
        return terms;

    }
}
