package aplicacoes.applicationConversion.entities;

public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double converterDollar(double real, double value){
        double valorConvertido = real * value;
        return valorConvertido + valorConvertido * IOF;
    }

}

