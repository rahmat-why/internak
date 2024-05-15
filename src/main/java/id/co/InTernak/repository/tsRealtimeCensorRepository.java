package id.co.InTernak.repository;

import id.co.InTernak.model.tsRealtimeCensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface tsRealtimeCensorRepository extends JpaRepository<tsRealtimeCensor,Integer> {
    @Procedure(procedureName = "getLatestData")
    public tsRealtimeCensor getLatestData();
}
