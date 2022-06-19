public class PedidoRejeitado implements PedidoEstado{

    private PedidoRejeitado(){};

    private static PedidoRejeitado instance = new PedidoRejeitado();
    public static PedidoRejeitado getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Pedido Rejeitado";
    }

    public String aprovarPagamento(Pedido pedido){
        return "Pagamento não aprovado";
    }

    public String rejeitarPagamento(Pedido pedido){
        return "Pagamento rejeitado";
    }

    public String esperarPagamento(Pedido pedido){
        return "O Pagamento já foi rejeitado";
    }

    public String enviarProduto(Pedido pedido){
        return "Pedido não enviado";
    }

}
