package javafirstapplicationgit;

public class Controller {
    
    private static final View view = new View();
    private static final Model[] model = new Model[view.numLetti()];
    
    public static void main(String[] args) {
        
        
        for (int i = 0; i < model.length; i++) {
            model[i] = new Model();
        }
        for (Model modArray : model) {
            modArray.setNomeMaterasso(view.inputMaterasso());
            modArray.setGrandezza(view.inputGrandezza());
            modArray.setCuscini(view.numCuscini());
            modArray.setPrezzo(view.inputPrezzo());
            view.Separator();
        }
        for (Model modArray : model) {
            view.Separator();
            view.Stampa(modArray.getNomeMaterasso(), modArray.getGrandezza(), modArray.getCuscini(), modArray.getPrezzo());
            
        }
        view.Powered();
        
        
        
    }
    
}
