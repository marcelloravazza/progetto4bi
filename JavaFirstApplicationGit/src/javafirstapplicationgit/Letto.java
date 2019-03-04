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
    
    
    Scanner s = new Scanner (System.in);
    Letto(){
      fatto = false;
      }
    
    public void Richiesta_Letti(){
        System.out.println("Quanti letti vuoi produrre?");
        n_letti = s.nextInt();
    }
   
    public void Dati_letto(){
        for (int i = 0; i < n_letti; i++) {
            System.out.println("\n------------------\n");
            System.out.println("Inserisci il nome del materasso:");
            nome = new Scanner(System.in).nextLine();
            System.out.println("Inserisci la grandezza:");
            grandezza = new Scanner(System.in).nextLine();
            System.out.println("Inserisci il numero di cuscini");
            cuscini = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("Inserisci il prezzo di vendita:");
            prezzo = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.println("\n------------------\n");
            Stampa(); 
        }
    }
  
    public void Stampa(){
        System.out.println("Nome del materasso:" + nome);
        System.out.println("Grandezza materasso:" + grandezza);
        System.out.println("Cuscini richiesti: " + cuscini);
        System.out.println("Prezzo:" + prezzo);
    }
    
    
}

