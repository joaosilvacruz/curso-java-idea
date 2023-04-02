package anotacoes.progFuncionalLambda.interfacesFuncionais.function.util;

import anotacoes.progFuncionalLambda.interfacesFuncionais.function.entities.Product;

import java.util.function.Function;

// O function recebe a entrada e a saída, Product é a entrada e String será a saída
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
