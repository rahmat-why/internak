package id.co.InTernak.repository;

import id.co.InTernak.model.MsCensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsCensorRepository extends JpaRepository<MsCensor, Integer> {
}
