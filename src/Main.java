import Pessoa.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jorge Alcantara", 1.85, 31);
        Pessoa p2 = new Pessoa("Maria Laura Albuquerque", 1.63, 19);
        Pessoa p3 = new Pessoa("Luiz Felipe Santos", 1.83, 26);
        Pessoa p4 = new Pessoa("Maurício Silva", 1.79, 20);
        Pessoa p5 = new Pessoa("Tifanny Almeida", 1.57, 23);
        Pessoa p6 = new Pessoa("Adalberto Fonseca", 1.75, 55);
        Pessoa p7 = new Pessoa("Antônio José de Souza", 1.72, 90);
        Pessoa p8 = new Pessoa("Lindalva de Jesus", 1.69, 47);

        OrdenacaoPessoa listaPessoas = new OrdenacaoPessoa(p1, p2, p3, p4, p5, p6, p7, p8);

        listaPessoas.adicionarPessoa("Lurdes dos Santos Conceição", 1.50, 63);

        listaPessoas.ordenarPorIdade();
        System.out.println("######################################## - Ordenando por Idade - ########################################\n");
        listaPessoas.retornaListaPessoas().forEach(System.out::println);
        System.out.println();

        listaPessoas.ordenarPorAltura();
        System.out.println("######################################## - Ordenando por Altura - ########################################\n");
        listaPessoas.retornaListaPessoas().forEach(System.out::println);
        System.out.println();

        listaPessoas.ordenarPorNome();
        System.out.println("######################################## - Ordenando por Nome - ########################################\n");
        listaPessoas.retornaListaPessoas().forEach(System.out::println);

    }
}
