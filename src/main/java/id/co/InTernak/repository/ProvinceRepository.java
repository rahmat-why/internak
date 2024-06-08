package id.co.InTernak.repository;

import id.co.InTernak.model.City;
import id.co.InTernak.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}
