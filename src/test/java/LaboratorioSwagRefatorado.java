import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LaboratorioSwagRefatorado {

    private TesteLogin Login;

    @Before
    public void inicializao() {
        this.Login = new TesteLogin();
        this.Login.inicializao();
    }
  

    @Test
    public void testPrimeiraCompra() {
        TesteLogin.login("standard_user", "secret_sauce");
        TesteLogin.adicionarItem("add-to-cart-sauce-labs-backpack");
        TesteLogin.produtoCarrinho();
        TesteLogin.confirmacaoPedido("Hermione", "Granger", "24120210");
        TesteLogin.finalizandoCompra();
        TesteLogin.mensagemConfirmacao();
    }
    
    @After
    public void finalizacao() {
        this.Login.finalizacao();
    }
    
}

