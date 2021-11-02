package anneeBissextile;

import java.util.Scanner;

public class AnneeBisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		
		int annee;
		
		System.out.println("Entrer l'annee ");
		annee=k.nextInt();
		
		if((annee%4)==0 && !(annee%100 == 0) ||(annee%400 == 0))
		{
			System.out.println("L'annee n'est pas bissextile ");
		}
		else
		{
			System.out.println("L'annee est bissextile ");
		}

	}

}
