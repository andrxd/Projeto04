import java.util.List;
import sp.senac.ejb.ProdutoEJB;
import sp.senac.ejb.ProdutoEJBLocal;
import sp.senac.ejb.UsuarioEJB;
import sp.senac.ejb.UsuarioEJBLocal;
import sp.senac.entidades.Usuario;
import sp.senac.entidades.Produto;
public class teste {

    public static void main(String[] args) {
        Usuario teste = new Usuario();
        UsuarioEJB uejb = new UsuarioEJB();
        ProdutoEJB pejb = new ProdutoEJB();
        
        List<Produto> listaProdutos =  pejb.buscarTodosProdutos();
        
        teste = uejb.autenticarUsuario("teste", "teste");
        
        
        System.out.println("Sucesso");
    }
    
}

