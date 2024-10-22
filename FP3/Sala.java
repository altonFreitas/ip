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
}
