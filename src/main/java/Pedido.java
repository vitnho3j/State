public class Pedido {

    private String nome;

    private PedidoEstado estado;

    public String getNome() {
        return nome;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Pedido(){
        this.estado = PedidoEmAnalise.getInstance();
    }

    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }

    public String aprovarPagamento(){
        return estado.aprovarPagamento(this);
    }

    public String rejeitarPagamento(){
        return estado.rejeitarPagamento(this);
    }

    public String esperarPagamento(){
        return estado.esperarPagamento(this);
    }

    public String enviarProduto(){
        return estado.enviarProduto(this);
    }


}
