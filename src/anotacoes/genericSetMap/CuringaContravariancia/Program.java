package anotacoes.genericSetMap.CuringaContravariancia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        // Na contravariância é possível adicionar valores, mas atribuir o valor a uma vaiavel qualquer.
        // Isso ocorre porque a

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add(10);
        myObjs.add(5);

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        //Number x = myNums.get(0);

    }
}
