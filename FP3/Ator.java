package FP3;

public class Ator {
    public String nome;
    public char genero;
    public String dataNas;

    public Ator (String nome, char genero, String dataNas ){
        this.nome = nome;
        this.genero = genero;
        this.dataNas = dataNas;
    }

    public String getNome(){
        return nome;
    }
    public char getGenero(){
        return genero;
    }
    public String getDataNas(){
        return dataNas;
    }
  
}