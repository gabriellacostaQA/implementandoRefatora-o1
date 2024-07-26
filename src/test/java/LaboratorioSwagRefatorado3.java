import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LaboratorioSwagRefatorado3 {

    private TesteLogin Login;

    @Before
    public void inicializao() {
        this.Login = new TesteLogin();
        this.Login.inicializao();
    }
  

    @Test
    public void comprandoTresBlusas() {
        TesteLogin.login("standard_user", "secret_sauce");
        TesteLogin.adicionarItem3("add-to-cart-sauce-labs-backpack", "add-to-cart-sauce-labs-bike-light", "add-to-cart-sauce-labs-bolt-t-shirt");  
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