package metodos_exercicio1.com;

import java.util.Scanner;

public class Exerciciogit1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 exeibiTexto("----------------------------------");
		 exeibiTexto("Exércicio 1 GIT HUB");
		 exeibiTexto("----------------------------------");
		 exeibiTexto(" ");
		 exeibiTexto("Calculadora");
		 exeibiTexto(" Escolha a operação digitando (+) para adição, (-) para subtração, (/) para divisão e (*) para multiplicação: ");
		 String sinal = scan.next();
		 exeibiTexto("Escolha o primeiro número :");
		 double n1 =  scan.nextDouble();
		 exeibiTexto("Escolha o segundo número :");
		 double n2 =  scan.nextDouble();
		 exeibiTexto(escolhaoperação(n1,n2,sinal));
		 exeibiTexto("----------------------------------");
		 exeibiTexto("Saudação");
		 exeibiTexto("Digite que horas são (só horas)? :");
		 int horas = scan.nextInt();
		 exeibiTexto(saudacao(horas));
		 exeibiTexto("----------------------------------");
		 exeibiTexto("Empréstimo");
		 exeibiTexto("Digite o valor a ser emprestado em R$ : ");
		 double valor = scan.nextDouble();
		 exeibiTexto("Digite o valor a quantidade de parcleas : ");
		 int qtd = scan.nextInt();
		 calcularEmprestimo(valor, qtd);
		// TODO Auto-generated method stub
     
	}
	
    public  static double soma(double n1, double n2) {
    	return n1 + n2;
    }
    public static double subtrai(double n1, double n2) {
    	return n1 + n2;
    }
    public static double multiplica(double n1, double n2) {
    	return n1 * n2;
    }
    public static double dividi (double n1, double n2) {
    	return n1 / n2;
    }
    public static void exeibiTexto(String resultado) {
     System.out.println(resultado);
    }
    
    public static String escolhaoperação(double n1, double n2, String operacao) {
    	switch(operacao) {
    	case "+":
    		return "O Resultado é " + soma(n1,n2);
    	case "-":
    		return "O Resultado é " + subtrai(n1,n2);
    	case "*": 
    		return "O Resultado é " + multiplica(n1,n2);
    	case "/":
    		return"O Resultado é " + dividi(n1,n2);
    	default:
    		return "Conta inválida";
    		
    	}
    	
    }
    
    public static String saudacao(int horas) {
    	if( 5 <= horas && horas <= 11) {
    		return "Bom dia";
    	}
    	else if( 12 <= horas && horas <= 17) {
    		return "Boa tarde" ;
    	}
    	else if(0 <= horas && horas <= 23) {
    		return "Boa noite";
    	}
    	else {
    		return "Hora inválida";
    	}
    	
    }
   public static double getTaxaTresParcelas() {
	   return 0.54;
   }
   public static double getTaxaDoisParcelas() {
	   return 0.30;
   }
   
   
public static void calcularEmprestimo(double valorEmp, int qtdParcelas) {
	if(qtdParcelas == 2) {
		double valorfinal = valorEmp = (valorEmp * getTaxaDoisParcelas());
		 exeibiTexto("o valor final do empréstimo para 2 parcelas é de:R$" + valorfinal);
	}
	else if(qtdParcelas == 3) {
		double valorfinal =  valorEmp = (valorEmp * getTaxaTresParcelas());
		 exeibiTexto("o valor final do empréstimo para 3 parcelas é de:R$" + valorfinal);
	}
	else {
		 exeibiTexto("Quantidade de parcelas recusada");
	}
	
}
}

