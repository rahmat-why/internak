package id.co.InTernak.dao.impl;

import id.co.InTernak.dao.tsNotificationDao;
import id.co.InTernak.model.tsNotification;
import id.co.InTernak.model.tsRealtimeCensor;
import id.co.InTernak.repository.tsNotificationRepository;
import id.co.InTernak.repository.tsRealtimeCensorRepository;
import id.co.InTernak.vo.tsNotificationVo;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class tsNotificationDaoImpl implements tsNotificationDao {
    @Autowired
    tsNotificationRepository tsNotificationRepository;

    public List<tsNotificationVo> getAllNotif() {
        Iterable<tsNotification> notifications = tsNotificationRepository.findAll();
        List<tsNotificationVo> tsNotificationVos = new ArrayList<>();
        for (tsNotification item : notifications) {
            tsNotificationVo tsNotificationVo= new tsNotificationVo(item);
            tsNotificationVos.add(tsNotificationVo);
        }
        return tsNotificationVos;
    }

    public tsNotificationVo getNotifById(Integer id) {
        Optional<tsNotification> notifications = tsNotificationRepository.findById(id);
        tsNotification notification = notifications.get();
        tsNotificationVo tsNotificationVo = new tsNotificationVo(notification);
        return tsNotificationVo;

    }
}
