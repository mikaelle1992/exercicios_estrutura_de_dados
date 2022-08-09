import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=0;i<3;i++){
			parabens();
		}
		parabenizaNome("Ana");
		parabenizaNome("Antonio");
		
		desenhaLinha(5);
		
		double media = calculaMedia(8.6, 9.2, 6.0);
		
		System.out.printf( "Média: %.2f", media );
		System.out.println();
		
		int valor_menor = menor_(639, 9);
		if (valor_menor != 0) {
			System.out.println("Número menor: "+ valor_menor);
		}
		else {
			System.out.println("valores iguais ou zero");
		}
		
		boolean negativoPositivo = valor_negativo(-8);
		if (negativoPositivo) {
			System.out.println("O valor digitado é Negativo");
		}else {
			System.out.println("O valor digitado é Positivo");
		}
			
		boolean parImpar = par_ou_impar(694);
		if (parImpar) {
			System.out.println("O Valor digitado Par");
		}else {
			System.out.println("O Valor digitado ImPar");
		}
		
		
		boolean Primo = numero_primo(100);
		System.out.println("Numero digitado primo:" + Primo);
		
		
		boolean perfeito = ehPerfeito(28);
		System.out.println("Numero perfeito:" + perfeito);
		
		categoria_nadador(5);
		int potencia = potenciacao(3, 2);
		System.out.println( "\nPotência: "+potencia);
		
		verificaInverso(1234, 4321);
		
//		calcula_cubo();
		
		
		
	}
	
	public static void parabens() {
		System.out.println("parabens");
	}
	public static void parabenizaNome(String nome) {
		System.out.println("parabens" + nome);
	}
	public static void desenhaLinha(int limite) {
		int i;
		for(i=0;i<limite;i++){
			System.out.print("_____________");
		}
		System.out.println();
	}
	
	public static double calculaMedia(double d, double e, double f) {
		double media = (d + e +f)/3;
		
		return media; 
	}
	
	public static int menor_(int valor1, int valor2) {
		int menor = 0;
		if (valor1 < valor2) {
			menor = valor1;
		}if (valor2 < valor1){
			menor = valor2;
		}
		else {
			menor = 0;
		}
		return menor; 	
	}
	
	
	public static boolean valor_negativo(int valor) {
		if (valor < 0) {
			return true;
		}
		return false;
	}
	
	
	public static void calcula_cubo() {
		Scanner teclado = new Scanner(System.in);
		int cubo = 0, valor, j;
		
		for (j =1;j<=10;j++) {
			System.out.print("Digite o "+j+"° numero:");
			valor = teclado.nextInt();
			cubo = valor * valor * valor;
			
			System.out.println("cubo:"+cubo);
		}
	}
	
	public static boolean par_ou_impar(int valor) {
		if (valor%2 == 0) {
			return true;// numero par
		}
		return false; // numero impar
	}
	
	
    private static boolean numero_primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
    
    
    public static boolean ehPerfeito(int n){
        int i, soma = 0;

        for(i = 1; i <= n/2; i++){
            if(n % i == 0)
                soma += i;
        }
        if(soma == n)
            return true;// é perfeito
        else
            return false;// não é perfeito
    }
    
    public static void categoria_nadador(int idade) {
    	if(idade >=5 && idade <=7) {
    		System.out.print("Infantil A");	
    	}
    	if(idade >=8 && idade <=10) {
    		System.out.print("Infantil B");
    	}
    	if(idade >=11 &&  idade <=13) {
    		System.out.print("Juventil A");
    	}
    	if(idade >=14 &&  idade <=17) {
    		System.out.print("Juventil B");
    	}
    	if(idade >=18){
    		System.out.print("Adulto");
    	}
    }
    
    public static int potenciacao(int base, int expoente) {
    	int potencia = base;
    	for(int j = 1; j < expoente; j++) {
    		potencia *= base;
    	}
    	
    	return potencia;
    }
	
    
    public static void verificaInverso(int valor1, int valor2) {
    	String x = Integer.toString(valor1);
    	String y = Integer.toString(valor2);
    	String c = "";
    	char ch;
    	 for (int i=0; i<x.length(); i++)
         {
           ch= x.charAt(i); 
           c= ch+c; 
         }
         if (c == y) {
        	 System.out.print("igual");
         }
         if (c != y) {
        	 System.out.print("não igual"+ c + y);
         }
		
    	
         
    }
}
