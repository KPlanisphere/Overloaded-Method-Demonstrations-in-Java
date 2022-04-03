//----------> Impresiones

class Impresiones{
	
	//SOBRECARGA DE METODOS
	public void saludo(){
		System.out.println("Hola mundo");
	}
	
	public void saludo(String mensaje){
		System.out.println(mensaje);
		
	}
	
	public void saludo(String mensaje, int numero){
		System.out.println("El mensaje enviado es: " + mensaje);
		System.out.println("El numero entero enviado es: " + numero);
	}
}
