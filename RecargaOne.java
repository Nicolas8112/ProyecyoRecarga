package Paquete;

public class RecargaOne {

    private double Saldo;
    private String ValorRecar;
    private String NumeroApos;

    public RecargaOne(String saldo, String valorRecar, String numeroApos) {
        this.Saldo = Double.parseDouble(saldo);
        this.ValorRecar = valorRecar;
        this.NumeroApos = numeroApos;
    }

    public RecargaOne() {

    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getValorRecar() {
        return ValorRecar;
    }

    public void setValorRecar(String valorRecar) {
        ValorRecar = valorRecar;
    }

    public String getNumeroApos() {
        return NumeroApos;
    }

    public void setNumeroApos(String numeroApos) {
        NumeroApos = numeroApos;
    }
}
