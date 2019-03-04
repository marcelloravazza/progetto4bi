package javafirstapplicationgit;

public class Main {
    
    private static Model m[];
    private static View v = new View();
    
    public static void main(String[] args) {
        
        m = new Model[v.numLetti()];
        
        for (int i = 0; i < m.length; i++) {
            m[i] = new Model();
        }
        for (int i = 0; i < m.length; i++) {
            m[i].setNomeMaterasso(v.inputMaterasso());
            m[i].setGrandezza(v.inputGrandezza());
            m[i].setCuscini(v.numCuscini());
            m[i].setPrezzo(v.inputPrezzo());
            v.Separator();
            v.Stampa(m[i].getNomeMaterasso(), m[i].getGrandezza(), m[i].getCuscini(), m[i].getPrezzo());
        }
        
        
        
    }
    
}
