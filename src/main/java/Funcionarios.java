//Luis Felipe Spessoto - 2648016
public class Funcionarios extends Pessoa{
    private String periodoEscala;
    private String cargo;

    //construtor
    public Funcionarios(){
            periodoEscala = "";
            cargo = "";
    }

    //getters
    public String getPeriodoEscala(){
            return periodoEscala;
    }	
    public String getCargo(){
            return cargo;
    }	

    //setters
    public void setPeriodoEscala(String periodoEscala){
            this.periodoEscala = periodoEscala;
    }
    public void setCargo(String cargo){
            this.cargo = cargo;
    }
}
