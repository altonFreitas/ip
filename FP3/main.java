package FP3;

public class main {
    public static void main(String[] args) {
        Ator atorPrinicpal = new Ator("ALTON FREITAS", 'M', "23-04-2003");
        Ator atorSecundaria = new Ator("ERMELINDA TILMAN", 'F', "19-03-2006");
        Filme filme = new Filme("SHE IS MY ONLY ONE",120, atorPrinicpal, atorSecundaria, Genero.ROMANCE, "22-10-2024");
        System.out.println("\n**************************************************************************************************"); 
        System.out.println("******************************* NEW MOVIE PREMIERES AT THE CINEMA ********************************");
        System.out.println("**************************************************************************************************\n");
        System.out.println("Title: " + filme.getTitulo());
        System.out.println("Gender: " + filme.getGenero());
        System.out.println("Production date: " + filme.getDataProducao());
        System.out.println("Duration: " + filme.getDuracao_min() + " Minutes");
        System.out.println("Actors: " + atorPrinicpal.getNome() + " and " + atorSecundaria.getNome() + "\n");
     

      
        
    }

    
}