public class Calculadora {
    private static Calculadora instance = new Calculadora();
    
    private Calculadora() {}

    public static Calculadora getInstance() {
        return instance;
    }


    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}