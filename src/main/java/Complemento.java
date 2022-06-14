public class Complemento extends AcaiDecorator{

    private String nomeComplemento;

    public Complemento(Acai acai, String nomeComplemento) {
        super(acai);
        this.nomeComplemento = nomeComplemento;
    }

    @Override
    public float getValorComplemento() {
        return 2.00f;
    }

    @Override
    public String getNomeComplemento() {
        return this.nomeComplemento;
    }
}
