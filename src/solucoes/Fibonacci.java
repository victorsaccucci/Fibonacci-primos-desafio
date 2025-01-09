package solucoes;

public class Fibonacci {

    public static int resolveFibonacciRescursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 0.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return resolveFibonacciRescursivo(n - 1) + resolveFibonacciRescursivo(n - 2);
    }

    public static int resolveFibonacciLinear(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 0.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, resultado = 0;
        for (int i = 2; i <= n; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }
}
