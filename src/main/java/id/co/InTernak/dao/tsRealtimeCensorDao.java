package id.co.InTernak.dao;

import id.co.InTernak.model.tsRealtimeCensor;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import org.springframework.stereotype.Repository;


public interface tsRealtimeCensorDao {
public tsRealtimeCensorVo getLatestData();
}
