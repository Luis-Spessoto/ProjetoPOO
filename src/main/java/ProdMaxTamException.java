
import javax.swing.JOptionPane;

//Luis Felipe Spessoto - 2648016
public class ProdMaxTamException extends Exception {
    
    public void impErrorExc() {
        JOptionPane.showMessageDialog(null, 
            "O nome do produto pode ter no máximo 15 caracteres!", 
            "ERROR", 
            JOptionPane.ERROR_MESSAGE);
    }

    public Produto corrigirTamProd(Produto p) {
        try {
            String novoNome = JOptionPane.showInputDialog(null, 
                "Informe um novo nome para o produto:", 
                "Novo Nome", 
                JOptionPane.INFORMATION_MESSAGE);
            
            if (novoNome == null || novoNome.trim().isEmpty() || novoNome.length() > 15) {
                throw new ProdMaxTamException();
            }

            p.setNome(novoNome);
        } catch (ProdMaxTamException pmt) {
            pmt.impErrorExc();
            p = corrigirTamProd(p); 
        }
        return p;
    }
}
