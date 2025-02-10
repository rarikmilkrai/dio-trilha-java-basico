/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author rarsilva
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String nomeCliente, agencia;
        float saldo;
        System.out.println("Por favor, digite o número da Agência ! ");
        numero = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Por favor, digite a Agencia ! ");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente ! ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta ! ");
        saldo = sc.nextFloat();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo :" + saldo + " já está disponível para saque");


    }
}
