public interface ProdutoService {
    List<Produto> getAllProdutos();
    Produto getProdutoById(int id);
    void addProduto(Produto produto);
    void updateProduto(Produto produto);
    void deleteProduto(int id);
}


