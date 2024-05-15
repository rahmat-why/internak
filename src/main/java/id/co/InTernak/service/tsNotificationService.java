package id.co.InTernak.service;

import id.co.InTernak.model.tsNotification;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.vo.tsNotificationVo;
import id.co.InTernak.vo.tsRealtimeCensorVo;

public interface tsNotificationService {
    public DtoResponse addNotif(tsNotificationVo tsNotificationVo);
    public  DtoResponse getAllNotif();
    public  DtoResponse updateNotif(tsNotificationVo tsNotification);
}
