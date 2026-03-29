package service;
import repository.RepositorioGenerico;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public abstract class ServicoGenerico<T> implements RepositorioGenerico<T> {
    @Override
    public void salvar(List<T> lista, T entidade) {
        lista.add(entidade);
    }

    @Override
    public List<T> buscarTodos(List<T> lista) {
        return lista.stream().toList();
    }

    @Override
    public List<T> filtrar(List<T> lista, Predicate<T> filtro) {
        return lista.stream().filter(filtro).toList();
    }

    @Override
    public void atualizar(List<T> lista, Predicate<T> filtro, Consumer<T> acao) {
        lista.stream()
                .filter(filtro) // Acha quem você quer atualizar
                .forEach(acao::accept); // Aplica a ação (Consumer) em cada um
    }

    @Override
    public void apagar(List<T> lista, T entidade) {
        lista.remove(entidade);
    }
}
