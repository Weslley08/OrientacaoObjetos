package encapsulamento;

public class Exemplo {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Weslley", 8, 12, 2000);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Weslley Jonathan");

        System.out.println(eu.getNome());

    }
}
