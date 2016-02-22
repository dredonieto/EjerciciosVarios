import java.util.Scanner;
public class CuentaAtras{
	public static void main(String[] args)throws Exception{
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		while(num > 0){
			System.out.println(num + "...");
			num--;
			Thread.sleep(1000);
		}
		System.out.println("IGNITION!");
	}
}