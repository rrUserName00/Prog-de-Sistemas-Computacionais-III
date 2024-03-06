public class Sistema_de_Biblioteca {


/**
 * InnerSistema_de_Biblioteca
 */
    public class blioteca {
        String LivroTitulo;
        String NomeAutor;
        Integer LivroISBN;
        Integer AnoPubli;
        Integer DataSaida;
        Integer DataDevolução;

    }

/**
 * InnerUsuario
 */
    public class usuario {
        String NomeUsuario;
        String IndereçoUsuario;
        String EmailUsuario;
        Integer TelefoneUsuario;
        
    }
        
    
}

//O sistema deve permitir

//Cadastrar livros, com informações como, titulo, autor, editora, ano de publicação e ISBN

//Cadastrar usuarios, com informações como, nome, endereço, telefone, e email. Registrar inprestimos e devoluções de livros, com controle de data eprazo de devolução

//Consultar o acervo por titulo, autor ou ISBN

//Gerar relatorios de emprestimos, com informações como livro mais emprestado e usuario com maior numero de emprestimos