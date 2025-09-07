package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Principal {

	public static void main(String[] args) {
		List<Usuario> listaUser = 
				new ArrayList<Usuario>();
		
		listaUser.add(new Usuario("jose","xpto"));
		listaUser.add(new Usuario("maria","abc1"));
		listaUser.add(new Usuario("pedro","xyz9"));
		
		UsuarioDAO dao = new UsuarioDAO();
		String login = JOptionPane.showInputDialog("Digite o login");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		
		Usuario user = new Usuario(login, senha);
		
		if (dao.autenticar(user, listaUser)) {
			JOptionPane.showMessageDialog(null, "AUTENTICADO");
		}
		else {
			JOptionPane.showMessageDialog(null, "USUÁRIO E/OU SENHA INCORRETOS");
		}
		
		
	}
}
