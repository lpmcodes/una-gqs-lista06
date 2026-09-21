public class Main {

    public static void main(String[] args) {

        String nome = "Lucas";
        int idade = 20;

        System.out.println("Usuário cadastrado!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("Usuário maior de idade.");
        } else {
            System.out.println("Usuário menor de idade.");
        }
    }
}