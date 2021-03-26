package edu.escuelaing.arep;

public class Exponente {

    public static String ResultExp(Double number){
        Double valorfin = Math.exp(number);
        String result = "{" +
                "Operation: Exponente"+
                ", Input:"+number+
                ", Output:"+valorfin+"}";
        return result;
    }
}
