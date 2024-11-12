package daguer.web.api.controller;

import daguer.web.api.model.Usuario;
import daguer.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return usuarioRepository.listAll();
    }

    @GetMapping("/{id}")
    public Usuario getOneById(@PathVariable("id") Integer id) {
        return usuarioRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        usuarioRepository.remove(id);
    }

    @PostMapping()
    public void saveUser(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
