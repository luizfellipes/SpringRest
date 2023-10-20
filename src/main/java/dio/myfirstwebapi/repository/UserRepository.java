package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {


    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        } else {
            System.out.println("Update - recebendo o usuario na camada de repositorio");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELTE/id - recebendo o id: %d para exculir um usuario\n" + id);
    }

    public List<Usuario> findAll() {
        System.out.println("List - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("luiz", "palavrapasse"));
        usuarios.add(new Usuario("fellipe", "passepalavra"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("Find/id - Recebendo o id: %d para localizar um usuario ", id);
        return new Usuario("Luiz", "palavrapasse");
    }

    public Usuario findByUsername(String username) {
        System.out.printf("Find/username - Recebendo o username: %S para consulta ", username);
        return new Usuario("Luiz", "palavrapasse");
    }


}
