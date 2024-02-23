package api.inventario.service;

import api.inventario.repository.TipoDispositivoRepositorio;
import api.inventario.models.TipoDispositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDispositivoServicio {
    private final TipoDispositivoRepositorio tipoDispositivoRepositorio;

    @Autowired
    public TipoDispositivoServicio(TipoDispositivoRepositorio tipoDispositivoRepositorio) {
        this.tipoDispositivoRepositorio = tipoDispositivoRepositorio;
    }

    public List<TipoDispositivo> obtenerTodos() {
        return tipoDispositivoRepositorio.findAll();
    }

    public TipoDispositivo obtenerPorId(Long id) {
        Optional<TipoDispositivo> tipoDispositivoOptional = tipoDispositivoRepositorio.findById(id);
        return tipoDispositivoOptional.orElse(null);
    }

    public TipoDispositivo crear(TipoDispositivo tipoDispositivo) {
        return tipoDispositivoRepositorio.save(tipoDispositivo);
    }

    public TipoDispositivo actualizar(Long id, TipoDispositivo tipoDispositivo) {
        if (tipoDispositivoRepositorio.existsById(id)) {
            tipoDispositivo.setId(id);
            return tipoDispositivoRepositorio.save(tipoDispositivo);
        }
        return null;
    }

    public void eliminar(Long id) {
        tipoDispositivoRepositorio.deleteById(id);
    }
}

