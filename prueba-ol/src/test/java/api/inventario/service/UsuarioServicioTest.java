package api.inventario.service;

import api.inventario.models.Usuario;
import api.inventario.repository.UsuarioRepositorio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class UsuarioServicioTest {

    @Mock
    private UsuarioRepositorio usuarioRepositorio;

    @InjectMocks
    private UsuarioServicio usuarioServicio;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testObtenerTodosLosUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1L, "Usuario1"));
        usuarios.add(new Usuario(2L, "Usuario2"));

        when(usuarioRepositorio.findAll()).thenReturn(usuarios);

        List<Usuario> result = usuarioServicio.obtenerTodosLosUsuarios();

        assertEquals(2, result.size());
        verify(usuarioRepositorio, times(1)).findAll();
    }

    @Test
    public void testObtenerUsuarioPorIdExistente() {
        Long id = 1L;
        Usuario usuario = new Usuario(id, "Usuario1");

        when(usuarioRepositorio.findById(id)).thenReturn(Optional.of(usuario));

        Usuario result = usuarioServicio.obtenerUsuarioPorId(id);

        assertEquals(usuario, result);
        verify(usuarioRepositorio, times(1)).findById(id);
    }

    @Test
    public void testObtenerUsuarioPorIdNoExistente() {
        Long id = 1L;

        when(usuarioRepositorio.findById(id)).thenReturn(Optional.empty());

        Usuario result = usuarioServicio.obtenerUsuarioPorId(id);

        assertNull(result);
        verify(usuarioRepositorio, times(1)).findById(id);
    }

    @Test
    public void testCrearUsuario() {
        Usuario usuario = new Usuario(null, "NuevoUsuario");

        when(usuarioRepositorio.save(usuario)).thenReturn(usuario);

        Usuario result = usuarioServicio.crearUsuario(usuario);

        assertEquals(usuario, result);
        verify(usuarioRepositorio, times(1)).save(usuario);
    }

    @Test
    public void testActualizarUsuario() {
        Long id = 1L;
        Usuario usuario = new Usuario(id, "Usuario1");

        when(usuarioRepositorio.save(usuario)).thenReturn(usuario);

        Usuario result = usuarioServicio.actualizarUsuario(id, usuario);

        assertEquals(usuario, result);
        verify(usuarioRepositorio, times(1)).save(usuario);
    }

    @Test
    public void testEliminarUsuario() {
        Long id = 1L;

        usuarioServicio.eliminarUsuario(id);

        verify(usuarioRepositorio, times(1)).deleteById(id);
    }
}

