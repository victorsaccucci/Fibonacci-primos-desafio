import solucoes.Fibonacci;
import solucoes.Primos;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fibonacci Recursivo:");
        System.out.println(Fibonacci.resolveFibonacciRescursivo(10));
        System.out.println("Fibonacci Linear:");
        System.out.println(Fibonacci.resolveFibonacciLinear(10));

        System.out.println("Primos Recursivo:");
        System.out.println(Primos.resolvePrimosRecursivo(10));
        System.out.println("Primos Linear:");
        System.out.println(Primos.resolvePrimoslinear(10));
    }
}
