package Primeiro;

public class main {
	public static void main(String[] args) {
	Usuario user = new Usuario(1, 1234, "Victor Freitag", "Permissão", "Freitagx");
	System.out.println("ID: "+user.getId());
	System.out.println("NOME: "+user.getNome());
	System.out.println("PERMISSÃO : "+user.getPermissao());
	System.out.println("USUARIO: "+user.getUsuario());
	System.out.println("SENHA: "+user.getPassword());
}}