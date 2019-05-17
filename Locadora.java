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

    // retorna o valor do aluguel dada uma locadora, ou retorna null caso ocorra algum erro
    public double calculaPrecoAluguel(String tipoCliente, int qtdMeioSemana, int qtdFds){
        double resultado = -1;
        if(tipoCliente.equalsIgnoreCase("Normal")){
            // calcula com os precos normais
            resultado = (qtdMeioSemana*valorSegSextReg) + (qtdFds*valorFdsReg);            
        }
        else{
            // quer dizer que e cliente fidelidade...
            resultado = (qtdMeioSemana*valorSegSextFidel) + (qtdFds*valorFdsFidel);
        }

        return resultado;
    }
    public String getNomeLocadora(){
        return nomeLocadora;
    }

    public Veiculo getVeiculo(){
        return tipoVeiculo;
    }

    public String getNomeVeiculo(){
        return tipoVeiculo.getModeloVeiculo();
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