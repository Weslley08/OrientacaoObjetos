package paradigma;

public class Pessoa {

    private String nome = "Weslley";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Ol�, meu nome � " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
