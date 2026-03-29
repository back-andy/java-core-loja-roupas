package repository;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface RepositorioGenerico<T>{
    void salvar(List<T> lista, T entidade);
    List<T> buscarTodos(List<T> lista);
    List<T> filtrar(List<T> lista, Predicate<T> filtro); // filtre esta lista usando esta regra (Predicate)
    void atualizar(List<T> lista, Predicate<T> filtro, Consumer<T> acao); // filtre e com base no filtro aplique uma regra (consumer)
    void apagar(List<T> lista, T entidade);
}
