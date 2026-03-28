package service;

import enums.Tamanho;
import model.Roupa;
import repository.EstoqueRepository;

import java.util.List;

public class EstoqueService implements EstoqueRepository {

    @Override
    public void adicionarRoupa(List<Roupa> listaRoupas, Roupa roupa) {
        listaRoupas.add(roupa);
    }

    @Override
    public List<String> findByTamanho(List<Roupa> estoque, Tamanho tamanho){
        return estoque.stream()
                .filter(roupa -> roupa.getTamanho() == tamanho)
                .map(Roupa::getNome).toList();
    }
}
