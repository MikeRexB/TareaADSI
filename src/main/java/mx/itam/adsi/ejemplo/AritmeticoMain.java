package mx.itam.adsi.ejemplo;

public class AritmeticoMain {

	public static void main(String... args){
		Aritmetico arit = new Aritmetico();

		System.out.println(arit.abs(-11));
		System.out.println(arit.min(-11,11));
	}

}
