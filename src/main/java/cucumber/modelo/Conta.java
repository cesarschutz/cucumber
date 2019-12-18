package cucumber.modelo;

public class Conta {
    private String dono;
    private Double limite;
    private Double saldo;
    private Integer numero;

    public Conta(String dono, Integer numero, Double limite, Double saldo) {
        this.dono = dono;
        this.limite = limite;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void depositar(Double valorDepositado) {
        this.saldo += valorDepositado;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
