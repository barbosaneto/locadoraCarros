public class Locadora{
    private String nomeLocadora; // nome da locadora (loja)
    private Veiculo tipoVeiculo; // veiculo com que a locadora trabalha
    private double valorSegSextReg; // valor da locacao de segunda a sexta para clientes regulares
    private double valorFdsReg; // valor da locacao no fim de semana para clientes regulares
    private double valorSegSextFidel; // valor da locacao de segunda a sexta para clientes com cartao fidelidade
    private double valorFdsFidel; // valor da locacao no fim de semana para clientes com cartao fidelidade

    public Locadora(String nomeLocadora, Veiculo tipoVeiculo, double valorSegSextReg, double valorSegSextFidel, double valorFdsReg, double valorFdsFidel){
        this.nomeLocadora = nomeLocadora;
        this.tipoVeiculo = tipoVeiculo;
        this.valorSegSextReg = valorSegSextReg;
        this.valorFdsReg = valorFdsReg;
        this.valorSegSextFidel = valorSegSextFidel;
        this.valorFdsFidel = valorFdsFidel;
    }

    public String getNomeLocadora(){
        return nomeLocadora;
    }

    public Veiculo getVeiculo(){
        return tipoVeiculo;
    }

    public double getValorSegSextReg(){
        return valorSegSextReg;
    }

    public double getValorFdsReg(){
        return valorFdsReg;
    }

    public double getValorSegSextFidel(){
        return valorSegSextFidel;
    }

    public double getValorFdsFidel(){
        return valorFdsFidel;
    }
}