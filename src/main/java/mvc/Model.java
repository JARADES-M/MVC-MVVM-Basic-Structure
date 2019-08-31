package mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {

    List<Usuario> usuarios = new ArrayList<>();

    public void cadastraUsuario(String nome, String email, String cpf) {
        this.usuarios.add(new Usuario(nome, email, cpf));
    }

    public List<String> buscaTodosUsuarios() {

        List<String> returnList;

        returnList = this.usuarios.stream().map(Usuario::toString).collect(Collectors.toList());

        return returnList;
    }

    private class Usuario {

        public Usuario(String nome, String email, String cpf) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
        }

        String nome;
        String email;
        String cpf;

        @Override
        public String toString() {
            return "Usuario{" +
                    "nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", cpf='" + cpf + '\'' +
                    '}';
        }
    }

}
