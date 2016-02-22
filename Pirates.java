import java.util.Scanner;
public class Pirates{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		String frase = entrada.nextLine();
		while(!frase.equals("end")){
			System.out.println(legPirata(frase));
			frase = entrada.nextLine();
		}
	}
	// Traduce a lenguaje pirata.
	public static String legPirata(String fra){
		String res = "";
		String vocals = "aeiou";
		int log = fra.length();
		// Construir un nuevo String duplicando las consonantes y añadiendo 'o': ahoi -> ahohoi
		for(int i = 0; i < log; i++){
			if(noEsCons(fra.charAt(0))){
				res += fra.charAt(0);
				fra = fra.substring(1);
			}else{
				res += fra.charAt(0) + "o" + fra.charAt(0);
				fra = fra.substring(1);
			}
		}
		return res;
	}
	// Devuelve true si lo que recibe como parámetro no es una consonante.
	public static boolean noEsCons(char simbolo){
		boolean res = false;
		String abc = "qwrtypsdfghjklñzxcvbnmQWRTYPSDFGHJKLÑZXCVBNM";
		if(!abc.contains(Character.toString(simbolo))){
			res = true;
		}
		return res;
	}
}