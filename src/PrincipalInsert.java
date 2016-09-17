
public class PrincipalInsert {
	
	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		
		u.setLogin("amy");
		u.setNome("Amy Maia de Sousa");
		u.setEmail("amy@gmail.com");
		
		UsuarioDAO.inserirUsuario(u); 
		
	}
	
	

}
