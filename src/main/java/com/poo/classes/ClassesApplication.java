package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		Funcionario pedro = new Gerente();

		Funcionario aline = new Atendente();

		boolean sair = false;

		while (!sair) {

			System.out.println("--------Menu---------");
			System.out.println("1- Imprimir Contra Cheque!");
			System.out.println("2- Sair");

			System.out.println("Escolha uma opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:

					if (pedro instanceof Gerente) {

						Gerente pedroCast = (Gerente) pedro;
						pedroCast.contraCheque();

					} else {

						System.out.println("Apenas gerentes podem imprimir o contracheque.");
					}
					break;

				case 2:
					sair = true;
					System.out.println("Saindo...");
					break;

				default:

					System.out.println("Insira uma opção válida!");
					break;

			}

			scanner.close();

		}

	}
}
