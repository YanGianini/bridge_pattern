public class ProdutoMedio extends Produto{

    public ProdutoMedio(float taxa){
        super(taxa);
    }
    public float calcularTaxa() {
        return (this.taxa * 2) * (1 + this.frete.percentualTaxa());
    }

}
