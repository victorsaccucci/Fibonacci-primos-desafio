package solucoes;

import java.util.ArrayList;
import java.util.List;

public class Primos {

        public static List<Integer> resolvePrimosRecursivo(int n) {
            if (n <= 1) {
                throw new IllegalArgumentException("N deve ser maior que 1.");
            }
            return procuraPrimos(n, new ArrayList<>());
        }

        private static List<Integer> procuraPrimos(int n, List<Integer> primos) {
            if (n == 2) {
                primos.add(2);
                return primos;
            }
            if (isPrimoRecursivo(n, n - 1)) {
                primos.add(n);
            }
            return procuraPrimos(n - 1, primos);
        }

        private static boolean isPrimoRecursivo(int numero, int divisor) {
            if (divisor == 1) return true;
            if (numero % divisor == 0) return false;
            return isPrimoRecursivo(numero, divisor - 1);
        }


    public static List<Integer> resolvePrimoslinear(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("N deve ser maior que 1.");
        }
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrimoLinear(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private static boolean isPrimoLinear(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

}
