public class PedidoEmAnalise implements PedidoEstado {

    private PedidoEmAnalise(){};

    private static PedidoEmAnalise instance = new PedidoEmAnalise();

    public static PedidoEmAnalise getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Em análise";
    }

    public String aprovarPagamento(Pedido pedido){
        pedido.setEstado(PedidoEnviado.getInstance());
        return "Pagamento aprovado";
    }

    public String rejeitarPagamento(Pedido pedido){
        pedido.setEstado(PedidoRejeitado.getInstance());
        return "Pagamento rejeitado";
    }

    public String esperarPagamento(Pedido pedido){
        return "O Pedido já está em análise";
    }

    public String enviarProduto(Pedido pedido){
        return "Produto não enviado";
    }



}
