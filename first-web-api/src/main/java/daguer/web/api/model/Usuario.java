package daguer.web.api.model;

public class Usuario {

    private Integer id;
    private String nome;
    private String password;

    public Usuario(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
