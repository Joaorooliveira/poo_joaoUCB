package polimorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola ,mundo");
        
        Calculadora calc = new Calculadora();

        calc.somar(2,3);

        calc.somar(2.5,3.5);

        Animal a1 = new Animal();
        a1.fazersom();

        Cachorro c1 = new Cachorro();
        c1.fazersom();

        Carro c2 = new Carro();
        Moto m1 = new Moto();
        acelerarVeiculo(c2);
        acelerarVeiculo(m1);
        
    }
    public static void acelerarVeiculo(Veiculo v) {
        v.acelerar();
        
    }


}
