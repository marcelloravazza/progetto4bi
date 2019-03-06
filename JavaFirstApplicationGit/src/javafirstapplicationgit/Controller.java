package javafirstapplicationgit;

public class Controller {
    
    private static Model m[];
    private static View v;
    
    public static void main(String[] args) {
        v = new View();
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
            v.Powered();
        }
        
        
        
    }
    
}
