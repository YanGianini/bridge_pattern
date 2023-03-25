import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoMedioTest {
    @Test
    void deveRetornarProdutoMedioComFreteNormal() {
        Frete frete = new FreteNormal();
        ProdutoMedio produtoMedio = new ProdutoMedio(100);
        produtoMedio.setFrete(frete);
        assertEquals(220, produtoMedio.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoMedioComFretePremium() {
        Frete frete = new FretePremium();
        ProdutoMedio produtoMedio = new ProdutoMedio(100);
        produtoMedio.setFrete(frete);
        assertEquals(240, produtoMedio.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoMedioComFreteExpress() {
        Frete frete = new FreteExpress();
        ProdutoMedio produtoMedio = new ProdutoMedio(100);
        produtoMedio.setFrete(frete);
        assertEquals(260, produtoMedio.calcularTaxa(), 0.01);
    }
}
