package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		float metros=Metros();
		
		System.out.println(metros+ " m/s");

	}
	
	public static float Metros(){
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		float km=0;
		String aux;
		
		do{
			System.out.print("Introduce la velocidad en km/h: ");
			aux=teclado.nextLine();
			
			try{
				km=Float.parseFloat(aux);
				error=false;
			}
			catch (Exception e){
				error=true;
				System.out.println("No has introducido un numero.");
			}
		}while(error);
		
		return km*0.27778f;
	}

}
