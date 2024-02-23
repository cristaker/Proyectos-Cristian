package api.inventario.service;

import api.inventario.Exceptions.ResourceNotFoundException;
import api.inventario.repository.FabricanteRepositorio;
import api.inventario.models.Fabricante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FabricanteServicio {

    private final FabricanteRepositorio fabricanteRepositorio;

    @Autowired
    public FabricanteServicio(FabricanteRepositorio fabricanteRepositorio) {
        this.fabricanteRepositorio = fabricanteRepositorio;
    }

    public List<Fabricante> obtenerTodosLosFabricantes() {
        return fabricanteRepositorio.findAll();
    }

    public Optional<Fabricante> obtenerFabricantePorId(Long id) {
        return fabricanteRepositorio.findById(id);
    }

    public Fabricante crearFabricante(Fabricante fabricante) {
        return fabricanteRepositorio.save(fabricante);
    }

    public Fabricante actualizarFabricante(Long id, Fabricante fabricante) {
        Fabricante fabricanteExistente = fabricanteRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fabricante no encontrado con id: " + id));
        fabricanteExistente.setNombre(fabricante.getNombre());
        return fabricanteRepositorio.save(fabricanteExistente);
    }

    public void eliminarFabricante(Long id) {
        fabricanteRepositorio.deleteById(id);
    }
}
