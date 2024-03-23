package atividade1;

public class Calculadora {

    Double numA;
    Double numB;


    Double somar(){
        return numA + numB;
    }
    Double subtrair(){
        return numA - numB;    
    }

    Double multiplicar(){
        return numA*numB;

    }
    Double dividir(){
        return numA / numB;
        
    }

    Boolean verificarNumeroPrimo(int n){

        if (n <=1) {
            return false;
        }

        if((n !=2) && (n %2== 0)) {
        return false;            
        }

        for(int i =3; i<n; i+=2){
            if (n% i ==0) {
                return false;            
            }
        }
        return true;


    }
}

