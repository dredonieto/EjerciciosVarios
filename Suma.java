import java.util.Scanner;
public class Suma{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int pri = entrada.nextInt();
		int seg = entrada.nextInt();
		System.out.println(tStr(pri, seg));
	}

	public static String tStr(int num, int num2){
		int res = num + num2;
		String suma = String.valueOf(num);
		suma += " + ";
		if(num2 < 0){
			suma += "("+ num2 + ") = " + res;
		}else{
			suma += num2 + " = " + res;
		}
		return suma;
	}
}