@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService produtoService;
    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }
    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable int id) {
        return produtoService.getProdutoById(id);
    }
    @PostMapping
    public void addProduto(@RequestBody Produto produto) {
        produtoService.addProduto(produto);
    }
    @PutMapping("/{id}")
    public void updateProduto(@PathVariable int id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoService.updateProduto(produto);
    }
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable int id) {
        produtoService.deleteProduto(id);
    }
}
