package Pk_LojaCarros;
public class Carro {
    private String nome;
    private int ano;
    private String cor;
    private int numPortas;
    private double valor;

    
    Carro(){
    
    }
    public Carro(String nome, int ano, String cor, int numPortas, double valor) {
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
        this.numPortas = numPortas;
        this.valor = valor;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
   
    
  
   

}
