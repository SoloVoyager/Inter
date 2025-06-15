package EntidadesFisicas;

public final class Laborador extends Pessoas {
    private String cargo;
    

    public Laborador() {
        super();
        this.cargo = "";
    }


    public Laborador(String cargo) {
        this.cargo = cargo;
    }


    public Laborador(int id, String cpf, String nome, String email, String telefone, String cargo) {
        super(id, cpf, nome, email, telefone);
        this.cargo = cargo;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
   

}
