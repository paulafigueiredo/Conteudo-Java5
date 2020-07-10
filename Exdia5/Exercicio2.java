package Exdia5;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		
		double peso, altura, imc;

        System.out.println("Informe o peso: ");
        peso = ler.nextDouble();
        System.out.println("Informe a altura: ");
        altura = ler.nextDouble();

        imc = (peso / (altura * altura));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc < 25) {
            System.out.println("Peso normal");
        }else if (imc < 30) {
            System.out.println("Acima do peso");
        }else {
            System.out.println("Obeso");
        }
		
	
		
		
	}

}
