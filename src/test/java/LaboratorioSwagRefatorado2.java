import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LaboratorioSwagRefatorado2 {

    private TesteLogin Login;

    @Before
    public void inicializao() {
        this.Login = new TesteLogin();
        this.Login.inicializao();
    }
  

    @Test
    public void filtrandoCompra() {
        TesteLogin.login("standard_user", "secret_sauce");
        TesteLogin.adicionarItem2("add-to-cart-test.allthethings()-t-shirt-(red)");
        TesteLogin.produtoCarrinho();
        TesteLogin.confirmacaoPedido("Harry", "Potter", "24120210");
        TesteLogin.finalizandoCompra();
        TesteLogin.mensagemConfirmacao();
    }
    
    @After
    public void finalizacao() {
        this.Login.finalizacao();
    }
    
}