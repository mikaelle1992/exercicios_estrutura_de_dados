
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<3;i++){
			parabens();
		}
		parabenizaNome("Ana");
		parabenizaNome("Antonio");
		desenhaLinha(5);
		double media = calculaMedia(8.6, 9.2, 6.0);
		System.out.printf( "Média: %.2f", media );
		System.out.println();
		int valor_menor = menor_(5, 15);
		System.out.println("Número menor: "+ valor_menor);
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
		}else{
			menor = valor2;
		}
		return menor; 	
	}
	
	
}
