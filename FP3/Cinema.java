package FP3;

public class Cinema {
    Sala[] salas;

    public Cinema() {
        salas = new Sala[3];

        salas = new Sala[3]; 
        salas[0] = new Sala(1, 100); 
        salas[1] = new Sala(2, 150);
        salas[2] = new Sala(3, 200);
       
    }

    public void exibirNumeroSala( int numeroSala, Filme filme){
        if (numeroSala > 0 && numeroSala <= salas.length){
            salas[numeroSala - 1].exibirFilme(filme); 
        }else{
            System.out.println("Sala invalida");
        }
    }
    public int getQuantidadeFilmesExibidosNaSala(int numeroSala) {
        if (numeroSala > 0 && numeroSala <= salas.length) {
            return salas[numeroSala - 1].getQuantidadeFilmesExibidos();
        } else {
            System.out.println("Sala inválida.");
            return -1;
        }
    }
    
}
