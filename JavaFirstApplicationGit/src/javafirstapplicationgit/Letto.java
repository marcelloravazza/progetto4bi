package javafirstapplicationgit;
import java.util.*;
 
public class Letto {
    String materasso;
    int cuscini;
    boolean fatto;
    int n_letti;
    String nome;
    String grandezza;
    int prezzo;
    
    Letto(){
        fatto = false;
    }
    
    public void Richiesta_Letti(){
        System.out.println("Quanti letti vuoi produrre?");
        n_letti = Integer.parseInt(input());
    }
   
    public void Dati_letto(){
        for (int i = 0; i < n_letti; i++) {
            System.out.println("\n------------------\n");
            System.out.println("Inserisci il nome del materasso:");
            nome = input();
            System.out.println("Inserisci la grandezza:");
            grandezza = input();
            System.out.println("Inserisci il numero di cuscini");
            cuscini = Integer.parseInt(input());
            System.out.println("Inserisci il prezzo di vendita:");
            prezzo = Integer.parseInt(input());
            System.out.println("\n------------------\n");
            Stampa(); 
        }
    }
    
    public String input(){
        return new Scanner(System.in).nextLine();
    }
  
    public void Stampa(){
        System.out.println("Nome del materasso:" + nome);
        System.out.println("Grandezza materasso:" + grandezza);
        System.out.println("Cuscini richiesti: " + cuscini);
        System.out.println("Prezzo:" + prezzo);
    
    }
}

