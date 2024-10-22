package FP3;
public class Filme{
    public int duracao_min;
    public Ator ator_prinicpal;
    public Ator ator_secundaria;
    public Genero genero;
    public String dataProducao;

    public Filme(int duracao_min, Ator ator_prinicpal, Ator ator_secundaria, Genero genero, String dataProducao) {
        this.duracao_min = duracao_min;
        this.ator_prinicpal = ator_prinicpal;
        this.ator_secundaria = ator_secundaria;
        this.genero = genero;
        this.dataProducao = dataProducao;
    }


}