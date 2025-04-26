package Pessoa;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Integer.compare(pessoa1.getIdade(), pessoa2.getIdade());
    }
}
