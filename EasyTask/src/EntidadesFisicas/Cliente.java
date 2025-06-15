package EntidadesFisicas;

public final class Cliente extends Pessoas {
    private String endereco;
   

    public Cliente() {
        super();
        this.endereco = "";
    }


    public Cliente(String endereco) {
        this.endereco = endereco;
    }


    public Cliente(int id, String cpf, String nome, String email, String telefone, String endereco) {
        super(id, cpf, nome, email, telefone);
        this.endereco = endereco;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
