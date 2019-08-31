package mvc;

import java.util.List;

public class View {
    // Faz primeira conexão com Controller
    // Pode fazer outras conexões com Model

    static Controller controller = new Controller();

    public static void main (String... argmts) {

        controller.cadastraUsuario("José Da Silva", "jose@silva.com", "11176539862");
        controller.cadastraUsuario("João Leite", "joao@leite.com", "135539862");
        controller.cadastraUsuario("Joanna Dark", "joana@dark.com", "11643219172");

        List<String> usuarios = controller.buscarTodosUsuarios();

        usuarios.forEach(System.out::println);

    }
}
