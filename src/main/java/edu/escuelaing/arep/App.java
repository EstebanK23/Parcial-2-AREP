package edu.escuelaing.arep;

import edu.escuelaing.arep.calculator.Calculator;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        port(getPort());
        get("/log", (req, res) -> {
            Double number = Double.parseDouble(req.queryParams("value"));

            return Calculator.Logaritmo(number);
        });

        get("/exp", (req, res) -> {
            Double number = Double.parseDouble(req.queryParams("value"));
            return Calculator.Exponente(number);
        });
    }

    /**
     * Metedo getPort se encarga de obtener el puerto para ejecutar localmente.
     * @return 4567 Puerto para ejecutar localmente
     **/
    static int getPort() {
        if (System.getenv("PORT") != null) {

            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
