package javafirstapplicationgit;

public class Controller {
    
    private static final View view = new View();
    private static final Model[] model = new Model[view.numLetti()];
    
    public static void main(String[] args) {
        
        
        for (int i = 0; i < model.length; i++) {
            model[i] = new Model();
        }
        for (int i = 0; i < model.length; i++) {
            model[i].setNomeMaterasso(view.inputMaterasso());
            model[i].setGrandezza(view.inputGrandezza());
            model[i].setCuscini(view.numCuscini());
            model[i].setPrezzo(view.inputPrezzo());
            view.Separator();
            view.Stampa(model[i].getNomeMaterasso(), model[i].getGrandezza(), model[i].getCuscini(), model[i].getPrezzo());
            view.Powered();
        }
        
        
        
    }
    
}
