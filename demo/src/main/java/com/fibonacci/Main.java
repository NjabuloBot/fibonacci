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
                    int n1 = 0;
                    int n2 = 1;
                    System.out.println("First "+nTerms+" fibonacci numbers are: ");
                    System.out.print(n1+" "+n2);
                    int numTerms = numSeries(nTerms);
                    for(int i = 0;i<numTerms;i++){
                        int n3 = n1+n2;
                        System.out.print(" "+n3);
                        n1 = n2;
                        n2 = n3;
                    }
                    System.out.println();
                    scan.close();
                    break;


                }
            }
        }


    static int numSeries(int terms){
        return terms;

    }
}
