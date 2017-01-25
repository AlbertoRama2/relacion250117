package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		float radio=0;
		String aux;
		
		do{
			System.out.print("Introduce el radio: ");
			aux=teclado.nextLine();
			
			try{
				radio=Float.parseFloat(aux);
				error=false;}
			catch (Exception e){
				error=true;
				System.out.println("No has introducido un numero.");
			}
			
		}while(error);
		
		float longitud= Longitud(radio);
		
		System.out.println("La longitud es: "+longitud);
		
		float area=Area(radio);
		
		System.out.println("El area es: "+area);
	}
	
	public static float Longitud(float radio){
		
		return 2*3.14f*radio;
		
	}
	
	public static float Area(float radio){
		
		return 3.14f*(radio*radio);
	}
}
