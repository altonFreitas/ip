package FP3;

public class Sala {
    int numeroSala;
    int capacidade;
    Filme filmAtual;
    Filme[] filmeExibidos;
    int contadorFilmeExibidos;

    public Sala(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.filmeExibidos = new Filme[100];
        this.contadorFilmeExibidos = 0;
    }

    public void exibirFilme(Filme filme) {
        if (contadorFilmeExibidos < this.filmeExibidos.length) {
            filmeExibidos[contadorFilmeExibidos] = filme;
            contadorFilmeExibidos++;
        } else {
            System.out.println("A sala está cheia!");
        }
    }
    public int getQuantidadeFilmesExibidos(){
        return contadorFilmeExibidos;

    }
}
