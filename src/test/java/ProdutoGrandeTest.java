import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoGrandeTest {
    @Test
    void deveRetornarProdutoGrandeComFreteNormal() {
        Frete frete = new FreteNormal();
        ProdutoGrande produtoGrande = new ProdutoGrande(100);
        produtoGrande.setFrete(frete);
        assertEquals(330, produtoGrande.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoGrandeComFretePremium() {
        Frete frete = new FretePremium();
        ProdutoGrande produtoGrande = new ProdutoGrande(100);
        produtoGrande.setFrete(frete);
        assertEquals(360, produtoGrande.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoGrandeComFreteExpress() {
        Frete frete = new FreteExpress();
        ProdutoGrande produtoGrande = new ProdutoGrande(100);
        produtoGrande.setFrete(frete);
        assertEquals(390, produtoGrande.calcularTaxa(), 0.01);
    }
}
