package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.model.Bodega;
@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{
	
}
