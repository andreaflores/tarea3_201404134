package tarea3_201404134;
import java.util.Scanner;
public class Tarea3_201404134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Ingrese número");
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		if(n%2==0)
			System.out.println("es par");
			else
				System.out.println("es impar");
	}
}