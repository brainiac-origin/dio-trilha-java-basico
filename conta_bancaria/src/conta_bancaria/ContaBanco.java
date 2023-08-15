package conta_bancaria;

import java.util.Scanner;

public class ContaBanco {
     public static void main(String[] args) {
    	Scanner scar = new Scanner(System.in);
    	 
    	ContaTerminal conta = new ContaTerminal(); 
    	
    	 System.out.println("Digite o seu nome");
 		conta.nomeCliente = scar.nextLine();
 		System.out.println("Digite o numero da conta");
 		conta.numero = scar.nextInt();
 		System.out.println("Digite o numero da agencia");
 		conta.agencia = scar.nextInt();
 		conta.saldo = 1000;
 		System.out.println("Olá "+conta.nomeCliente+", Obligado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+", e Seu Saldo "+conta.saldo+", já está disponivel para saque");
 		
 		
  	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
