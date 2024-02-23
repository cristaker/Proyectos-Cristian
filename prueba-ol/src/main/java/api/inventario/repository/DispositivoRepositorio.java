package api.inventario.repository;

import api.inventario.models.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepositorio extends JpaRepository<Dispositivo, Long> {
}
