package br.com.carnaval;

public class Vip extends Ingresso{

    private double valorAdcicioal;

    public Vip(double valorIngresso, double valorAdcicioal) {
        super(valorIngresso);
        this.valorAdcicioal = valorAdcicioal;
    }

    public double getValorAdcicioal() {
        return valorAdcicioal;
    }

    public void setValorAdcicioal(double valorAdcicioal) {
        this.valorAdcicioal = valorAdcicioal;
    }

    public String imprimeIngresso(){
        return "Ingresso VIP: " + (getValorIngresso() + getValorAdcicioal());
    }

}
