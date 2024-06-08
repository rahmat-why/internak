package id.co.InTernak.repository;

import id.co.InTernak.model.City;
import id.co.InTernak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

}
