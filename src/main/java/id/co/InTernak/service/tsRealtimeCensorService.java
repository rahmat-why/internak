package id.co.InTernak.service;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.vo.tsRealtimeCensorVo;

public interface tsRealtimeCensorService {
public DtoResponse saveRealtime(tsRealtimeCensorVo tsRealtimeVo);
public  DtoResponse getLatestData();
}
