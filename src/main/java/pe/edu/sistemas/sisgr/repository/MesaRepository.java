package pe.edu.sistemas.sisgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.sistemas.sisgr.domain.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa,Integer>{

}
