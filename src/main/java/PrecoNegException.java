
import javax.swing.JOptionPane;

//Luis Felipe Spessoto - 2648016
public class PrecoNegException extends Exception{
    public void impErrorExc() {
        JOptionPane.showMessageDialog(null, 
            "O valor não pode ser negativo!", 
            "ERROR", 
            JOptionPane.ERROR_MESSAGE);
    }

    public Produto corrigirValorNeg(Produto p) {
        try {
            String novoPreco = JOptionPane.showInputDialog(null, 
                "Informe um novo valor para o produto:", 
                "Novo Valor", 
                JOptionPane.INFORMATION_MESSAGE);
            
            if (novoPreco == null || Integer.parseInt(novoPreco) < 0) {
                throw new PrecoNegException();
            }

            p.setPreco(Integer.parseInt(novoPreco));
            
        } catch (PrecoNegException pne) {
            pne.impErrorExc();
            p = corrigirValorNeg(p); 
        }
        return p;
    }
}
