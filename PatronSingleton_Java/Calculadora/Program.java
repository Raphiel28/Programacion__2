public class Program {
    public static void main(String[] args) {
        Calculadora cal = Calculadora.getInstance();

        int suma = cal.sumar(5, 10);
        int resta = cal.restar(79, 10);
        int multiplicacion = cal.multiplicar(6, 8);
        int division = cal.dividir(128, 6);

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        
    }
}