public class Pizzeria
{
    static final int CUATRO_QUESOS = 1;
    static final int HAWAIANA = 2;
    static final int JAMON_QUESO = 3;

    public static Pizza crearPizza(int id) {
        switch (id) {
            case 1:
                return new PizzaCuatroQuesos();
                
            case 2:
                return new PizzaHawaiana();

            case 3:
                return new PizzaJamonQueso();

            default:
                return null;
        }
    }

    public static Pizza crearPizza(String id) {
        if (id.equalsIgnoreCase("cuatroquesos")) {
            return new PizzaCuatroQuesos();
        } 
        else if (id.equalsIgnoreCase("hawaiana")) {
            return new PizzaHawaiana();
        } 
        else if (id.equalsIgnoreCase("jamonqueso")) {
            return new PizzaJamonQueso();
        } 
        else {
            return null;
        }
    }
}