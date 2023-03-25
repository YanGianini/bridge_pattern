import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoPequenoTest {

    @Test
    void deveRetornarProdutoPequenoComFreteNormal() {
        Frete frete = new FreteNormal();
        ProdutoPequeno produtoPequeno = new ProdutoPequeno(100);
        produtoPequeno.setFrete(frete);
        assertEquals(110, produtoPequeno.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoPequenoComFretePremium() {
        Frete frete = new FretePremium();
        ProdutoPequeno produtoPequeno = new ProdutoPequeno(100);
        produtoPequeno.setFrete(frete);
        assertEquals(120, produtoPequeno.calcularTaxa(), 0.01);
    }

    @Test
    void deveRetornarProdutoPequenoComFreteExpress() {
        Frete frete = new FreteExpress();
        ProdutoPequeno produtoPequeno = new ProdutoPequeno(100);
        produtoPequeno.setFrete(frete);
        assertEquals(130, produtoPequeno.calcularTaxa(), 0.01);
    }
}