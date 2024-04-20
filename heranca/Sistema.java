package heranca;

import heranca.empresa.Engenheiro;
import heranca.empresa.Gerente;

public class Sistema {
    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("Joao", 123, 123,"crea 1","Orientacao a objeto",100000.0);
        Engenheiro eng2 = new Engenheiro("Pedro", 124, 124,"crea 2","Orientacao a objeto",150000.0);

        Gerente ger1 = new Gerente("JP", 125, 125,200000.0,2);


        System.out.println(eng1);
        System.out.println(eng2);

    }
}
