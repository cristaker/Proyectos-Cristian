package api.inventario.repository;

import api.inventario.models.ModeloDispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloDispositivoRepositorio extends JpaRepository<ModeloDispositivo, Long> {
}
