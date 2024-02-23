package api.inventario.controllers;

import api.inventario.models.Usuario;
import api.inventario.service.UsuarioServicio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UsuarioControladorTest {

    private UsuarioServicio usuarioServicioMock;
    private UsuarioControlador usuarioControlador;

    @BeforeEach
    void setUp() {
        usuarioServicioMock = mock(UsuarioServicio.class);
        usuarioControlador = new UsuarioControlador(usuarioServicioMock);
    }

    @Test
    void obtenerTodosLosUsuariosDeberiaRetornarListaDeUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1L, "csanchez", "csanchez@example.com"),
                new Usuario(2L, "csanchez1", "csanchez@example.com")
        );
        when(usuarioServicioMock.obtenerTodosLosUsuarios()).thenReturn(usuarios);

        List<Usuario> result = usuarioControlador.obtenerTodosLosUsuarios();

        assertEquals(usuarios.size(), result.size());
        assertEquals(usuarios, result);
    }

    @Test
    void obtenerUsuarioPorIdDeberiaRetornarUsuarioCorrecto() {
        Long id = 1L;
        Usuario usuario = new Usuario(id, "csanchez", "csanchez@example.com");
        when(usuarioServicioMock.obtenerUsuarioPorId(id)).thenReturn(usuario);

        Usuario result = usuarioControlador.obtenerUsuarioPorId(id);

        assertEquals(usuario, result);
    }

    @Test
    void crearUsuarioDeberiaRetornarUsuarioCreado() {
        Usuario usuarioEntrada = new Usuario(null, "csanchez", "csanchez@example.com");
        Usuario usuarioCreado = new Usuario(1L, "csanchez1", "csanchez1@example.com");
        when(usuarioServicioMock.crearUsuario(usuarioEntrada)).thenReturn(usuarioCreado);

        Usuario result = usuarioControlador.crearUsuario(usuarioEntrada);

        assertEquals(usuarioCreado, result);
    }

    @Test
    void actualizarUsuarioDeberiaRetornarUsuarioActualizado() {
        Long id = 1L;
        Usuario usuarioActualizado = new Usuario(id, "csanchez", "csanchez@example.com");
        when(usuarioServicioMock.actualizarUsuario(id, usuarioActualizado)).thenReturn(usuarioActualizado);

        Usuario result = usuarioControlador.actualizarUsuario(id, usuarioActualizado);

        assertEquals(usuarioActualizado, result);
    }

    @Test
    void eliminarUsuarioDeberiaLlamarEliminarUsuarioEnServicio() {
        Long id = 1L;

        usuarioControlador.eliminarUsuario(id);

        verify(usuarioServicioMock, times(1)).eliminarUsuario(id);
    }
}

