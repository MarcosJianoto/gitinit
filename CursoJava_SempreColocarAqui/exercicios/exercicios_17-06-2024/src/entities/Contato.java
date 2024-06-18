package entities;

public class Contato {

    private String name;
    private String telefone;
    private String email;

    public Contato(String name, String telefone, String email) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
