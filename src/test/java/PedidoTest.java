import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp(){
        pedido = new Pedido();
    }

    @Test
    public void deveAprovarPagamentoEmPedidoEmAnalise(){
        pedido.setEstado(PedidoEmAnalise.getInstance());
        assertEquals("Pagamento aprovado", pedido.aprovarPagamento());
    }

    @Test
    public void deveRejeitarPagamentoEmPedidoEmAnalise(){
        pedido.setEstado(PedidoEmAnalise.getInstance());
        assertEquals("Pagamento rejeitado", pedido.rejeitarPagamento());
    }

    @Test
    public void naoDeveEsperarPagamentoEmPedidoEmAnalise(){
        pedido.setEstado(PedidoEmAnalise.getInstance());
        assertEquals("O Pedido já está em análise", pedido.esperarPagamento());
    }

    @Test
    public void naoDeveEnviarProdutoEmAnalise(){
        pedido.setEstado(PedidoEmAnalise.getInstance());
        assertEquals("Produto não enviado", pedido.enviarProduto());
    }

    @Test
    public void naoDeveAprovarPagamentoEmPedidoAprovado(){
        pedido.setEstado(PedidoAprovado.getInstance());
        assertEquals("O Pedido já foi aprovado", pedido.aprovarPagamento());
    }

    @Test
    public void deveRejeitarPagamentoEmProdutoAprovado(){
        pedido.setEstado(PedidoAprovado.getInstance());
        assertEquals("Pedido rejeitado", pedido.rejeitarPagamento());
    }

    @Test
    public void naoDeveEsperarPagamentoEmProdudoAprovado(){
        pedido.setEstado(PedidoAprovado.getInstance());
        assertEquals("O Pedido já foi aprovado", pedido.esperarPagamento());
    }

    @Test
    public void deveEnviarEmPedidoAprovado(){
        pedido.setEstado(PedidoAprovado.getInstance());
        assertEquals("Pedido enviado", pedido.enviarProduto());
    }

    @Test
    public void naoDeveAprovarPagamentoEmPedidoEnviado(){
        pedido.setEstado(PedidoEnviado.getInstance());
        assertEquals("Pagamento não aprovado", pedido.aprovarPagamento());
    }

    @Test
    public void naoDeveRejeitarPagamentoEmPedidoEnviado(){
        pedido.setEstado(PedidoEnviado.getInstance());
        assertEquals("O Pedido já foi enviado", pedido.rejeitarPagamento());
    }

    @Test
    public void naoDeveEsperarPagamentoEmPedidoEnviado(){
        pedido.setEstado(PedidoEnviado.getInstance());
        assertEquals("O Pedido já foi enviado", pedido.esperarPagamento());
    }

    @Test
    public void naoDeveEnviarPedidoEmPedidoEnviado(){
        pedido.setEstado(PedidoEnviado.getInstance());
        assertEquals("O Pedido já foi enviado", pedido.enviarProduto());
    }

    @Test
    public void naoDeveRejeitarPedidoEmPedidoRejeitado(){
        pedido.setEstado(PedidoRejeitado.getInstance());
        assertEquals("Pagamento rejeitado", pedido.rejeitarPagamento());
    }

    @Test
    public void naoDeveAprovarPagamentoEmPedidoRejeitado(){
        pedido.setEstado(PedidoRejeitado.getInstance());
        assertEquals("Pagamento não aprovado", pedido.aprovarPagamento());
    }

    @Test
    public void naoDeveEsperarPagamentoEmPedidoRejeitado(){
        pedido.setEstado(PedidoRejeitado.getInstance());
        assertEquals("O Pagamento já foi rejeitado", pedido.esperarPagamento());
    }

    @Test
    public void naoDeveEnviarProdutoEmPagamentoRejeitado(){
        pedido.setEstado(PedidoRejeitado.getInstance());
        assertEquals("Pedido não enviado", pedido.enviarProduto());
    }

}
