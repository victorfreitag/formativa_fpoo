package Terceiro;

public class main {
	public static void main(String[] args) {
	Fisica fisica = new Fisica("Victor Freitag", "49027741867", "12345678");
	
	System.out.println("NOME: "+fisica.getNome());
	System.out.println("CPF: "+fisica.getCpf());
	System.out.println("RG: "+fisica.getRg());
	
}
}