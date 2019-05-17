public class Veiculo{
    private int numPassageiros;
    private String modeloVeiculo;
    private String tipo; //SUV, Esportivo ou compacto

    public Veiculo(int numPassageiros, String modeloVeiculo, String tipo){
        this.numPassageiros = numPassageiros;
        this.tipo = tipo;
        this.modeloVeiculo = modeloVeiculo;
    }
    public String getModeloVeiculo(){
        return modeloVeiculo;
    }
    public int getNumPassageiros(){
        return numPassageiros;
    }
    public String getTipo(){
        return tipo;
    }
    
}