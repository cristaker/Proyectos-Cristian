package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.models.Dispositivo;
import api.inventario.repository.DispositivoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class DispositivoServicio {

    private final DispositivoRepositorio dispositivoRepositorio;

    public DispositivoServicio(DispositivoRepositorio dispositivoRepositorio) {
        this.dispositivoRepositorio = dispositivoRepositorio;
    }

    public Dispositivo obtenerDispositivoPorId(Long id) {
        return dispositivoRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo no encontrado con id: " + id));
    }

    public Dispositivo crearDispositivo(Dispositivo dispositivo) {
        return dispositivoRepositorio.save(dispositivo);
    }

    public Dispositivo actualizarDispositivo(Long id, Dispositivo dispositivo) {
        Dispositivo dispositivoExistente = dispositivoRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dispositivo no encontrado con id: " + id));
        dispositivoExistente.setNombre(dispositivo.getNombre());
        dispositivoExistente.setEstado(dispositivo.getEstado());
        return dispositivoRepositorio.save(dispositivoExistente);
    }

    public void eliminarDispositivo(Long id) {
        dispositivoRepositorio.deleteById(id);
    }
}
