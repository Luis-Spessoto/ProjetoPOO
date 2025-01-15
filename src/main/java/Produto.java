//Luis Felipe Spessoto - 2648016
public class Produto {
    private String nome;
    private Fornecedores fornecedor;
    private int codProduto;	
    private int quantidade;
    private double preco;
    private Funcionarios funcionario;	
    private Clientes cliente;

    //construtor
    public Produto(){
            nome = "";
            fornecedor = new Fornecedores();
            codProduto = 0;
            quantidade = 0;
            preco = 0;
            funcionario = new Funcionarios();
            cliente = new Clientes();
    }


    //getters
    public String getNome(){
            return nome;
    }
    public Fornecedores getFornecedor(){
            return fornecedor;
    }
    public int getCodProduto(){
            return codProduto;
    }
    public double getPreco(){
            return preco;
    }
    public Funcionarios getFuncionario(){
            return funcionario;
    }
    public Clientes getCliente(){
            return cliente;
    }
    public int getQuantidade(){
            return quantidade;
    }

    //setters
    public void setNome(String nome) throws ProdMaxTamException{
            if(nome.length() <= 15){
                    this.nome = nome;
            }
            else{
                    throw new ProdMaxTamException();
            }
    }
    public void setFornecedor(Fornecedores fornecedor){
            this.fornecedor = fornecedor;
    }
    public void setCodProduto(int codProduto){	
            this.codProduto = codProduto;
    }
    public void setPreco(double preco) throws PrecoNegException{
            if(preco >= 0){
                    this.preco = preco;
            }
            else{
                    throw new PrecoNegException();
            }
    }

    //sobrecarga do setPreco para receber desconto
    public void setPreco(double preco, double desconto){
            if(preco >= 0 && desconto >= 0){
                    this.preco = preco - (preco * (desconto / 100));
            }
    }


    public void setFuncionario(Funcionarios funcionario){
            this.funcionario = funcionario;
    }
    public void setCliente(Clientes cliente){
            this.cliente = cliente;
    }
    public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
    }

}
