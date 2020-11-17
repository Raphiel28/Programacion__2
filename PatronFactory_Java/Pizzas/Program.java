public class Program
{
    public static void main(String[] args) {
        Pizza pizza1 = Pizzeria.crearPizza(Pizzeria.CUATRO_QUESOS);
        Pizza pizza2 = Pizzeria.crearPizza(Pizzeria.JAMON_QUESO);
        Pizza pizza3 = Pizzeria.crearPizza(Pizzeria.HAWAIANA);

        pizza1.hornear();
        pizza2.hornear();
        pizza3.hornear();
    }
}