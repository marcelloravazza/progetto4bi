package javafirstapplicationgit;
import java.util.Scanner;
public class View {
    
    
    public String input(){
        return new Scanner(System.in).nextLine();
    }
    
    public int numLetti(){
        System.out.println("Quanti letti sono da aggiungere al fascicolo?");
        return Integer.parseInt(input());
    }
    
    public String inputMaterasso(){
        System.out.println("Inserisci il nome del materasso: ");
        return input();
    }
    
    public String inputGrandezza(){
        System.out.println("Inserisci la grandezza del materasso: ");
        return input();
    }
    
    public int numCuscini(){
        System.out.println("Inserisci il numero di cuscini: ");
        return Integer.parseInt(input());
    }
    
    public int inputPrezzo(){
        System.out.println("Inserisci il prezzo: ");
        return Integer.parseInt(input());
    }
    
    public void Separator(){
        System.out.println("\n----------\n");
    }
    
    public void Powered(){
        System.out.println("Powered by Leonardo e Alessandro");
    }
    
    public void Stampa(String nome, String grandezza, int cuscini, int prezzo){
        System.out.println("Nome del materasso:         " + nome);
        System.out.println("Grandezza del materasso:    " + grandezza);
        System.out.println("Quantità dei cuscini:       " + cuscini);
        System.out.println("Prezzo del materasso:       " + prezzo + "$");
    }
}
