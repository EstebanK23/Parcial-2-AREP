package edu.escuelaing.arep;

public class Logaritmo {

    public static String ResultLog(Double number){
        Double valorfin = Math.log(number);
        String result = "{" +
                "Operation: Logaritmo"+
                ", Input:"+number+
                ", Output:"+valorfin+"}";
        return result;
    }
}
