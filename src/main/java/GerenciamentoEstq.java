import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

//Luis Felipe Spessoto - 2648016

public class GerenciamentoEstq implements VerificarEstoque{
    
    private static GerenciamentoEstq geraEstqUnic;
    private Produto p;
    private List<Produto> produtos;

    
    private GerenciamentoEstq(){
        produtos = new ArrayList<>();
        p = new Produto();
    }
    
    //Singleton
    public static GerenciamentoEstq geraEstq(){
        if(geraEstqUnic == null){
            geraEstqUnic = new GerenciamentoEstq();
        }
        return geraEstqUnic;
    }

    public List<Produto> getProdutos(){
            return produtos;
    }
    

    @Override
    public boolean verificaEstoque(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                     "Estoque insuficiente para venda!\nQuantidade restante: " + produto.getQuantidade() + " unidades.");
            return false;
        }
    }
    
    public Produto consProdLista(Produto p){
	for(Produto produto : produtos){
            if(produto.getCodProduto() == p.getCodProduto()){
		return produto;
            }
	}
	return null;
    }
    
    public Produto comprarProd(Produto p){
	if(consProdLista(p) == null){
            produtos.add(p);
            return p;
	}
	else{
            return null;
	}
    }
    
    public Produto venderProd(int codigo, int quantidade){
        for(Produto p : produtos){
            if(p.getCodProduto() == codigo) {
                if(verificaEstoque(p, quantidade)) {
                    p.setQuantidade(p.getQuantidade() - quantidade);
                    if(p.getQuantidade() == 0) {
                        deletarProduto(p.getCodProduto());
                    }
                    return p;
                }     
            }
        }
        return null;
    }

    public void deletarProduto(int codigo){
        for(int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getCodProduto() == codigo) {
                produtos.remove(i);
                JOptionPane.showMessageDialog(null, "Atualizando estoque.....Produto removido!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Produto não consta no estoque!");
    }
}
