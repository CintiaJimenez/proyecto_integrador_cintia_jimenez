package com.portfolio.cintia_jimenez.Security.Service;

import com.portfolio.cintia_jimenez.Security.Entity.Usuario;
import com.portfolio.cintia_jimenez.Security.Repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email) {
        return iUsuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        iUsuarioRepository.save(usuario);
    }
}
