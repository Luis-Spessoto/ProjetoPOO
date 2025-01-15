//Luis Felipe Spessoto - 2648016
public class Clientes extends Pessoa{
    private String cpf;
    private int idade;


    //construtor
    public Clientes(){
            cpf = "";
            idade = 0;
    }

    //getters
    public String getCpf(){
            return cpf;
    }
    public int getIdade(){
            return idade;
    }

    //setters
    public void setCpf(String cpf){
            this.cpf = cpf;
    }
    public void setIdade(int idade){
            this.idade = idade;
    }

}
