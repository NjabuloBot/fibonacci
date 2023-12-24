package demo.src.main.java.com.fibonacci;

public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        numberSeries terms = new numberSeries();
        int nterms = terms.numSeries();
        System.out.println("Fibonacci series of the first "+nterms+" fibonacci numbers: ");
        System.out.print(n1+" "+n2);
        for(int i = 0;i<nterms;i++){
            int n3 = n2 + n1;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
