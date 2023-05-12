package br.senai.sp.jandira;

import java.util.Scanner;

public class Looping{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantas vezes você deseja ver o seu nome repetido? ");
        int numRepeticoes = scanner.nextInt();
        
        for (int i = 1; i <= numRepeticoes; i++) {
            System.out.println(i + ": " + nome);
        }
        
        scanner.close();
    }
}

