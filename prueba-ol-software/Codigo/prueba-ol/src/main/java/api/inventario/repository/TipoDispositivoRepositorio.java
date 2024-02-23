package api.inventario.repository;

import api.inventario.models.TipoDispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDispositivoRepositorio extends JpaRepository<TipoDispositivo, Long> {
}
