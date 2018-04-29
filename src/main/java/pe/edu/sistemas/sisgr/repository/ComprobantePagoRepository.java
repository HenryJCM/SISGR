package pe.edu.sistemas.sisgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisgr.domain.ComprobantePago;

@Repository
public interface ComprobantePagoRepository extends JpaRepository<ComprobantePago, Integer>{

}