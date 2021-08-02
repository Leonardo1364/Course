package util;

public class CurrencyConverter {

    public static double IOF = 0.06; //atributo estatico

    public static double dollarToReal(double amount, double dollarPrice) {
        return dollarPrice * amount * (1.0 + IOF);
    }



}
