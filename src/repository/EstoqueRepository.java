package repository;

import enums.Tamanho;
import model.Roupa;

import java.util.List;

public interface EstoqueRepository {
    public void adicionarRoupa(List<Roupa> listaRoupas, Roupa roupa);
    public List<String> findByTamanho(List<Roupa> estoque, Tamanho tamanho);
}
