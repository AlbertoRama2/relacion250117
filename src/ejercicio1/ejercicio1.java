package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		float GF = GradosFahrenheit();
		
		System.out.println(GF+" Grados Fahrenheit");
		
	}
	
	public static float GradosFahrenheit(){
		Scanner teclado=new Scanner(System.in);
		boolean error=false;
		String auxTem;
		float GC=0;
		do{
			System.out.print("Introduce los grados centigrados: ");
			auxTem=teclado.nextLine();
			
			try{
				GC=Float.parseFloat(auxTem);
				error=false;
				}
			catch (Exception e){
				error=true;
				System.out.println("No has introducido un numero.");
			}
		}while(error);
		
		return 32+(9*GC/5);
	}

}
