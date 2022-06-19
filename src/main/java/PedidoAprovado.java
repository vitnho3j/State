public class PedidoAprovado implements PedidoEstado{

    private PedidoAprovado(){};

    private static PedidoAprovado instance = new PedidoAprovado();

    public static PedidoAprovado getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Pedido Aprovado";
    }

    public String aprovarPagamento(Pedido pedido){
        return "O Pedido já foi aprovado";
    }

    public String rejeitarPagamento(Pedido pedido){
        pedido.setEstado(PedidoRejeitado.getInstance());
        return "Pedido rejeitado";
    }

    public String esperarPagamento(Pedido pedido){
        return "O Pedido já foi aprovado";
    }

    public String enviarProduto(Pedido pedido){
        pedido.setEstado(PedidoEnviado.getInstance());
        return "Pedido enviado";
    }

}
