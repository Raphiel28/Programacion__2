
public class Program {
public static void main(String[] arg) {

	
	ClienteImpl cliente1 = new ClienteImpl("Raphiel","Burdier",5);
	
	ClienteImpl clienteClonado = (ClienteImpl) cliente1.clonar();
	
	System.out.println(cliente1);
	System.out.println(clienteClonado);
	
	System.out.println(cliente1 == clienteClonado);
}
}
