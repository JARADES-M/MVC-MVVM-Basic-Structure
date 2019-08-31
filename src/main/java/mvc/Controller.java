package mvc;

import java.util.List;

public class Controller {
    // Recebe conexão
    // Comunica com o modelo
    // Libera comunicação View - Modelo

    Model model = new Model();

    public void cadastraUsuario(String nome, String email, String cpf) {
        this.model.cadastraUsuario(nome, email, cpf);
    }

    public List<String> buscarTodosUsuarios () {
        return this.model.buscaTodosUsuarios();
    }

}
