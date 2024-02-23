package api.inventario.repository;

import api.inventario.models.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepositorio extends JpaRepository<Fabricante, Long> {
}
