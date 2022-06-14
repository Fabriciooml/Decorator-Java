public abstract class AcaiDecorator implements Acai {
    private Acai acai;
    public String complementos;

    public AcaiDecorator(Acai acai) {
        this.acai = acai;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public abstract float getValorComplemento();

    @Override
    public float getValor(){
        return this.acai.getValor() + this.getValorComplemento();
    }

    public abstract String getNomeComplemento();

    @Override
    public String getComplementos() {
        return this.acai.getComplementos() + " + " + this.getNomeComplemento();
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }
}
