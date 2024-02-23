package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.ModeloDispositivo;
import api.inventario.repository.ModeloDispositivoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ModeloDispositivoServicio {

    private final ModeloDispositivoRepositorio modeloDispositivoRepositorio;

    public ModeloDispositivoServicio(ModeloDispositivoRepositorio modeloDispositivoRepositorio) {
        this.modeloDispositivoRepositorio = modeloDispositivoRepositorio;
    }

    public ModeloDispositivo obtenerModeloPorId(Long id) {
        return modeloDispositivoRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Modelo de dispositivo no encontrado con id: " + id));
    }

    public ModeloDispositivo crearModelo(ModeloDispositivo modeloDispositivo) {
        return modeloDispositivoRepositorio.save(modeloDispositivo);
    }

    public ModeloDispositivo actualizarModelo(Long id, ModeloDispositivo modeloDispositivo) {
        ModeloDispositivo modeloExistente = obtenerModeloPorId(id);
        modeloExistente.setNombre(modeloDispositivo.getNombre());
        modeloExistente.setFabricante(modeloDispositivo.getFabricante());
        return modeloDispositivoRepositorio.save(modeloExistente);
    }

    public void eliminarModelo(Long id) {
        modeloDispositivoRepositorio.deleteById(id);
    }
}
