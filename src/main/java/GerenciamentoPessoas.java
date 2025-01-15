
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Luis Felipe Spessoto - 2648016
 
public class GerenciamentoPessoas {
    
    private List<Funcionarios> func;
    private List<Fornecedores> forn;
    private List<Clientes> clien;
    
    //MÉTODO SINGLETON
    private static GerenciamentoPessoas geraUm;
    
    public static GerenciamentoPessoas geraGerPessoas(){
        if(geraUm == null){
            geraUm = new GerenciamentoPessoas();
        }
        return geraUm;
    }
    public GerenciamentoPessoas() {
        func = new ArrayList<>();
        forn = new ArrayList<>();
        clien = new ArrayList<>();
    }

    public List<Funcionarios> getFuncionarios() {
        return func;
    }

    public List<Fornecedores> getFornecedores() {
        return forn;
    }

    public List<Clientes> getClientes() {
        return clien;
    }

    
    private boolean idFuncionarioExiste(int id) {
        for (Funcionarios f : func) {
            if (f.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    private boolean idFornecedorExiste(int id) {
        for (Fornecedores f : forn) {
            if (f.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    private boolean idClienteExiste(int id) {
        for (Clientes c : clien) {
            if (c.getId() == id) {
                return true;
            }
        }
        return false;
    }
    
    public void cadFunc(Funcionarios funcionario) {
        if (idFuncionarioExiste(funcionario.getId())) {
            JOptionPane.showMessageDialog(null, "Já existe um funcionário com o ID informado!", "ERRO", JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        func.add(funcionario);
        JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void cadForn(Fornecedores fornecedor) {
        if (idFornecedorExiste(fornecedor.getId())) {
            JOptionPane.showMessageDialog(null, "Já existe um fornecedor com o ID informado!", "ERRO", JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        forn.add(fornecedor);
        JOptionPane.showMessageDialog(null, "Fornecedor adicionado com sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void cadClien(Clientes cliente) {
        if (idClienteExiste(cliente.getId())) {
            JOptionPane.showMessageDialog(null, "Já existe um cliente com o ID informado!", "ERRO", JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        clien.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);
    }
    
}
