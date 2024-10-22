package FP3;
public class Filme{
    public String titulo;
    public int duracao_min;
    public Ator ator_prinicpal;
    public Ator ator_secundaria;
    public Genero genero;
    public String dataProducao;

    public Filme(String titulo,int duracao_min, Ator ator_prinicpal, Ator ator_secundaria, Genero genero, String dataProducao) {
        this.titulo = titulo;
        this.duracao_min = duracao_min;
        this.ator_prinicpal = ator_prinicpal;
        this.ator_secundaria = ator_secundaria;
        this.genero = genero;
        this.dataProducao = dataProducao;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getDuracao_min(){
        return duracao_min;
    }
    public Ator getAtor_prinicpal(){
        return ator_prinicpal;
    }

    public Ator getAtor_secundaria(){
        return ator_secundaria;
    }
    public Genero getGenero(){
        return genero;
    }
    public String getDataProducao(){
        return dataProducao;
    }
    


}