package id.co.InTernak.repository;

import id.co.InTernak.model.DetailCageCensor;
import id.co.InTernak.model.DetailCageCensorPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DetailCageCensorRepository extends JpaRepository<DetailCageCensor, DetailCageCensorPK> {
}
