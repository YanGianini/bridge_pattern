public abstract class Produto {
    protected Frete frete;
    protected float taxa;

    public Produto(float taxa) {
        this.taxa = taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public abstract float calcularTaxa();
}
