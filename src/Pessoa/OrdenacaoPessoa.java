package Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoas;

    public OrdenacaoPessoa() {
        pessoas = new ArrayList<Pessoa>();
    }
    public OrdenacaoPessoa(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public OrdenacaoPessoa(Pessoa...pessoa) {
        this.pessoas = new ArrayList<Pessoa>(Arrays.asList(pessoa));
    }

    public void adicionarPessoa(Pessoa p) {
        this.pessoas.add(p);
    }
    public void adicionarPessoa(String nome,double altura, int idade) {
        this.pessoas.add(new Pessoa(nome,altura,idade));
    }

    public void ordenarPorNome() {
        this.pessoas.sort(Pessoa::compareTo);
    }
    public void ordenarPorIdade() {
        this.pessoas.sort(new OrdenarPorIdade());
    }
    public void ordenarPorAltura() {
        this.pessoas.sort(new OrdenarPorAltura());
    }

    public List<Pessoa> retornaListaPessoas() {
        return Collections.unmodifiableList(this.pessoas);
    }
}
