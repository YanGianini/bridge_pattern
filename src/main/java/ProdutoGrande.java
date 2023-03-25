public class ProdutoGrande extends Produto{

    public ProdutoGrande(float taxa){
        super(taxa);
    }
    public float calcularTaxa() {
        return (this.taxa * 3) * (1 + this.frete.percentualTaxa());
    }
}