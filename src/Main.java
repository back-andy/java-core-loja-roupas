import enums.Categoria;
import enums.Tamanho;
import model.Roupa;
import service.EstoqueService;

void main() {
    EstoqueService crud = new EstoqueService();
    List<Roupa> roupas = new ArrayList<>();

    Roupa calsa = new Roupa("calsa", Tamanho.G, new BigDecimal("149.99"), "Bege", Categoria.CALCA);
    Roupa brusa = new Roupa("brusa", Tamanho.M, new BigDecimal("49.99"), "Preta", Categoria.CAMISA);

    crud.adicionarRoupa(roupas, calsa);
    crud.adicionarRoupa(roupas, brusa);

    System.out.println(crud.findByTamanho(roupas, Tamanho.G));
}
