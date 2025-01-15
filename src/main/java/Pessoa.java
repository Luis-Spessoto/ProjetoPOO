//Luis Felipe Spessoto - 2648016

public abstract class Pessoa {
    private String nome;
    private int id;

    //construtor	
    Pessoa(){
            nome = "";
            id = 0;
    }

    //getters
    public String getNome(){
            return nome;
    }	
    public int getId(){
            return id;
    }	

    //setters
    public void setNome(String nome){
            this.nome = nome;
    }	
    public void setId(int id){
            this.id = id;
    }
    
}
