package anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.util;

import anotacoes.progFuncionalLambda.interfacesFuncionais.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 80.0;
    }
}
