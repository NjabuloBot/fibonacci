package demo.src.main.java.com.fibonacci;

public class fibSequence {
    int n1 = 0;
    int n2 = 1;

    public String sequence(int nTerms){
        String sequence = n1+" "+n2;
        series terms = new series();
        int numTerms = terms.numSeries(nTerms);
        for(int i = 2;i<numTerms;i++){
            int n3 = n1+n2;
            sequence+=" "+n3;
            n1 = n2;
            n2 = n3;
        }
        return sequence;

    }


    
}
