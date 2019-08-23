package mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Usuario> usuarios = new ArrayList<>();


    public void cadastraUsuario(String nome, String email, String cpf) {

        this.usuarios.add(new Usuario(nome, email, cpf));

    }

    public void buscaTodosUsuarios() {

    }


    class Usuario {

        public Usuario(String nome, String email, String cpf) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
        }

        String nome;
        String email;
        String cpf;
    }
}
