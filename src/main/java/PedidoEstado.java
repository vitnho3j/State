public interface PedidoEstado {

    String getEstado();

    String aprovarPagamento(Pedido pedido);

    String rejeitarPagamento(Pedido pedido);

    String esperarPagamento(Pedido pedido);

    String enviarProduto(Pedido pedido);

}
