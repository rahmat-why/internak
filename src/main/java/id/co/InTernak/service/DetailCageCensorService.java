package id.co.InTernak.service;

import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.vo.DetailCageCensorVo;
import id.co.InTernak.vo.DetailCageCensorVoForm;

public interface DetailCageCensorService {
    DtoResponse getDetailById(Integer dtc_id);
    DtoResponse saveDetail(DetailCageCensorVoForm detailCageCensorVo);
    DtoResponse updateDetail(DetailCageCensorVoForm detailCageCensorVo);
}
