
 class ClienteImpl implements Icliente {
	 
	 private String nombre;
	 private String apellido;
	 private int edad;
	 
	
	 public ClienteImpl(String nombre, String apellido, int edad ) {
		 
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.edad = edad;
		 
	 }
	 
	 public ClienteImpl() {
		 
		 
		 
	 }
	 
	@Override
	public Icliente clonar() {
		// TODO Auto-generated method stub
		 ClienteImpl cliente = null;
		 
		 try {
			 cliente = (ClienteImpl) clone();
		 }catch(CloneNotSupportedException e) {
			 e.printStackTrace();
		 }
		
		
		return cliente;
	}
	@Override
	public String toString() {
		return "ClienteImpl = [Nombre = " + nombre + ", Apellido = " + apellido + ", Edad = " + edad + "]";
		
	}



}
