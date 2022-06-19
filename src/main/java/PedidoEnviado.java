public class PedidoEnviado implements PedidoEstado{

    private PedidoEnviado(){};

    private static PedidoEnviado instance = new PedidoEnviado();
    public static PedidoEnviado getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Pedido Enviado";
    }

    public String aprovarPagamento(Pedido pedido){
        return "Pagamento não aprovado";
    }

    public String rejeitarPagamento(Pedido pedido){
        return "O Pedido já foi enviado";
    }

    public String esperarPagamento(Pedido pedido){
        return "O Pedido já foi enviado";
    }

    public String enviarProduto(Pedido pedido){
        return "O Pedido já foi enviado";
    }

}
