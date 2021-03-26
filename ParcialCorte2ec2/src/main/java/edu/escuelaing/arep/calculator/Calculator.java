package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;

public class Calculator {
    public Calculator(){}

    public static String ConverLog(Double number,Double input){
        Gson archivo = new Gson();
        String result = "{" +
                "\"Operation: Logaritmo\":"+
                "\"Input:\":"+input+
                "\"Output:\":"+number+"}";
        return archivo.toJson(result);
    }

    public static String ConverExp(Double number,Double input){
        Gson archivo = new Gson();
        String result = "{" +
                "\"Operation: Exponente\":"+
                "\"Input:\":"+input+
                "\"Output:\":"+number+"}";
        return archivo.toJson(result);
    }

    public static String Logaritmo(Double number){
        Double result =0.0;
        result = Math.log(number);
        return ConverLog(result,number);
    }

    public static String Exponente(Double number){
        Double result =0.0;
        result = Math.exp(number);
        return ConverExp(result,number);
    }
}
