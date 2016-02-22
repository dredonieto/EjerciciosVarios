
public class CasoDni{
	public static void main(String[] args){
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numDNis = Integer.parseInt(args[0]);
		int elem;
		for(int i = 1; i <= numDNis; i++){
			if(args[i].startsWith("X")){
				String cambio = args[i].substring(1);
				elem = Integer.parseInt(cambio);
				char c = letraDNI(elem, tabla);
				System.out.println(c);
			}else{
				elem = Integer.parseInt(args[i]);
				char c = letraDNI(elem, tabla);
				System.out.println(c);
			}
		}
		
	}
	public static char letraDNI(int numero, String tbl){
		int module = numero % 23;
		return tbl.charAt(module);
	}
}