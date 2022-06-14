public class Fruta extends AcaiDecorator{

    private String nomeFruta;

    public Fruta(Acai acai, String nomeFruta) {
        super(acai);
        this.nomeFruta = nomeFruta;
    }

    @Override
    public float getValorComplemento() {
        return 3.00f;
    }

    @Override
    public String getNomeComplemento() {
        return this.nomeFruta;
    }
}