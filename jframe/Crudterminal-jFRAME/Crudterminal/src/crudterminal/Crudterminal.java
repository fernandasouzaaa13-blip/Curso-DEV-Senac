package crudterminal;

import dao.ProdutoDAO;

public class Crudterminal {

    public static void main(String[] args) {

        ProdutoDAO daoProdutos = new ProdutoDAO();

        daoProdutos.listarTodosProdutos();
        daoProdutos.deletarProduto();
        daoProdutos.inserirProduto();
        daoProdutos.listarTodosProdutos();

    }
}
