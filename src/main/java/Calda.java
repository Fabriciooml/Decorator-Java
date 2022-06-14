public class Calda extends AcaiDecorator{

    private String nomeCalda;

    public Calda(Acai acai, String nomeCalda) {
        super(acai);
        this.nomeCalda = nomeCalda;
    }

    @Override
    public float getValorComplemento() {
        return 0.50f;
    }

    @Override
    public String getNomeComplemento() {
        return this.nomeCalda;
    }
}