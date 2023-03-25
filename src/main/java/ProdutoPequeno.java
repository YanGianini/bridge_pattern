public class ProdutoPequeno extends Produto{

    public ProdutoPequeno(float taxa){
        super(taxa);
    }
    public float calcularTaxa() {
        return this.taxa * (1 + this.frete.percentualTaxa());
    }
}
