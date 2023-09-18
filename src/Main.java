import java.util.Scanner;

public class Main {

    //Clase de tipo float que retorna la media aritmética de dos numeros enteros introducidos por teclado en el main
    public static float mediaAritmetica(int entrada1,int entrada2){
        return ((entrada1+entrada2)/2);
    }


    public static double radioCirculo(int radio){
        return(Math.PI*Math.pow(radio,2));
    }

    //Sumar Dos Primos

    public static boolean comprobarPrimos(int n){
        //comprobar si es un numero Primo
        boolean esPrimo = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }

    public static int sumarPrimos(int n1, int n2){
        int suma = n1 + n2;
        return suma;
    }

    public static void Fibonnaci(int n){
        int fibo1 = 1;
        int fibo2 = 1;
        int i;
        //Hacer que imprima todos los menores a n
        System.out.println(fibo1);
        for(i=2; i<=n; i++){
            System.out.println(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }

    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1;
        int num2;
        int n1;
        int n2;
        boolean primos;
        System.out.println("Introduce los dos numeros a hacer la media aritmetica.");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        System.out.print("Media Aritmética: ");
        System.out.println(mediaAritmetica(num1,num2));
        int radio;
        System.out.println("Introduce el radio");
        radio = teclado.nextInt();
        System.out.println("El radio del circulo es: " + radioCirculo(radio));

        //Sumar Dos Primos
        do {
            System.out.println("Introduce un numero");
            n1 = teclado.nextInt();
            primos = comprobarPrimos(n1);
            if(primos == true) {
                System.out.println("Es primo");
            }
            else {
                System.out.println("No es primo");
            }
        }while (primos==false);

        do {
            System.out.println("Introduce un numero");
            n2 = teclado.nextInt();
            primos = comprobarPrimos(n2);
            if(primos == true) {
                System.out.println("Es primo");
            }
            else {
                System.out.println("No es primo");
            }
        }while (primos==false);

        System.out.println(sumarPrimos(n1,n2));

        //Fibonnaci
        System.out.println("Introduce un numero");
        int n = teclado.nextInt();
        Fibonnaci(n);





    }
}