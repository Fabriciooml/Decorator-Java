import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcaiTest {
    @Test
    void retornaValorAcai() {
        Acai acai = new AcaiGrande(20.00f);

        assertEquals(20.00f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComComplemento() {
        Acai acai = new Complemento(new AcaiGrande(20.00f), "Granola");

        assertEquals(22.00f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComCalda() {
        Acai acai = new Calda(new AcaiGrande(20.00f), "Menta");

        assertEquals(20.50f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComFruta() {
        Acai acai = new Fruta(new AcaiGrande(20.00f), "Morango");

        assertEquals(23.00f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComComplementoECalda() {
        Acai acai = new Complemento(new Calda(new AcaiGrande(20.00f), "Menta"), "Granola");

        assertEquals(22.50f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComComplementoEFruta() {
        Acai acai = new Complemento(new Fruta(new AcaiGrande(20.00f), "Morango"), "Granola");

        assertEquals(25.00f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComCaldaEFruta() {
        Acai acai = new Calda(new Fruta(new AcaiGrande(20.00f), "Morango"), "Menta");

        assertEquals(23.50f, acai.getValor());
    }

    @Test
    void retornaValorAcaiComComplementoECaldaEFruta() {
        Acai acai = new Complemento(new Calda(new Fruta(new AcaiGrande(20.00f), "Morango"), "Menta"), "Granola");

        assertEquals(25.50f, acai.getValor());
    }

    @Test
    void retornaComplementosAcai() {
        Acai acai = new AcaiGrande(20.00f);

        assertEquals("Açaí Grande", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComComplemento() {
        Acai acai = new Complemento(new AcaiGrande(20.00f), "Granola");

        assertEquals("Açaí Grande + Granola", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComCalda() {
        Acai acai = new Calda(new AcaiGrande(20.00f), "Menta");

        assertEquals("Açaí Grande + Menta", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComFruta() {
        Acai acai = new Fruta(new AcaiGrande(20.00f), "Morango");

        assertEquals("Açaí Grande + Morango", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComComplementoECalda() {
        Acai acai = new Complemento(new Calda(new AcaiGrande(20.00f), "Menta"), "Granola");

        assertEquals("Açaí Grande + Menta + Granola", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComComplementoEFruta() {
        Acai acai = new Complemento(new Fruta(new AcaiGrande(20.00f), "Morango"), "Granola");

        assertEquals("Açaí Grande + Morango + Granola", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComCaldaEFruta() {
        Acai acai = new Calda(new Fruta(new AcaiGrande(20.00f), "Morango"), "Menta");

        assertEquals("Açaí Grande + Morango + Menta", acai.getComplementos());
    }

    @Test
    void retornaComplementosAcaiComComplementoECaldaEFruta() {
        Acai acai = new Complemento(new Calda(new Fruta(new AcaiGrande(20.00f), "Morango"), "Menta"), "Granola");

        assertEquals("Açaí Grande + Morango + Menta + Granola", acai.getComplementos());
    }

}
