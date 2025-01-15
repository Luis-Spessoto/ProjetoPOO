//Luis Felipe Spessoto - 2648016
public class Fornecedores extends Pessoa{
    private String cnpj;
    private String tipoProduto; //ex: limpeza, higiene, hortifruti, etc...

    //construtor
    public Fornecedores(){
            cnpj = "";
            tipoProduto = "";
    }

    //getters
    public String getCnpj(){
            return cnpj;
    }	
    public String getTipoProduto(){
            return tipoProduto;
    }

    //setters

    public void setCnpj(String cnpj){
            this.cnpj = cnpj;
    }
    public void setTipoProduto(String tipoProduto){
            this.tipoProduto = tipoProduto;
    }

}
