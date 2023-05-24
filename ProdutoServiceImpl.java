public class ProdutoServiceImpl implements ProdutoService {
    private ProdutoRepository produtoRepository;
    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.getAllProdutos();
    }
    @Override
    public Produto getProdutoById(int id) {
        return produtoRepository.getProdutoById(id);
    }

    @Override
    public void addProduto(Produto produto) {
        produtoRepository.addProduto(produto);
    }

    @Override
    public void updateProduto(Produto produto) {
        produtoRepository.updateProduto(produto);
    }

    @Override
    public void deleteProduto(int id) {
        produtoRepository.deleteProduto(id);
    }
}
