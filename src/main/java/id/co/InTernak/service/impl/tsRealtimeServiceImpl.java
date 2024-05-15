package id.co.InTernak.service.impl;

import id.co.InTernak.dao.tsRealtimeCensorDao;
import id.co.InTernak.model.tsRealtimeCensor;
import id.co.InTernak.repository.tsRealtimeCensorRepository;
import id.co.InTernak.response.DtoResponse;
import id.co.InTernak.service.tsRealtimeCensorService;
import id.co.InTernak.vo.tsRealtimeCensorVo;
import jakarta.transaction.Transactional;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static id.co.InTernak.constant.AllConstant.*;

@Service
@Transactional
public class tsRealtimeServiceImpl  implements tsRealtimeCensorService {
        @Autowired
        private tsRealtimeCensorDao tsRealtimeCensorDao;

        @Autowired
        private tsRealtimeCensorRepository tsRealtimeCensorRepository;

        @Override
        public DtoResponse getLatestData() {
            if(tsRealtimeCensorDao.getLatestData() != null) {
                return new DtoResponse(200, tsRealtimeCensorDao.getLatestData());
            }
            return new DtoResponse(200, null, mEmptyData);
        }



    @Override
    public DtoResponse saveRealtime(tsRealtimeCensorVo tsRealtime) {
        try {
            if (tsRealtime.getRlt_value() == null ||
                    tsRealtime.getRlt_timestamp() == null) {
                return new DtoResponse(500, null, mCreateFailed);
            }
            tsRealtimeCensor tsRealtimeCensor = new tsRealtimeCensor();
            tsRealtimeCensor.setDtc_id(tsRealtime.getDtc_id());
            tsRealtimeCensor.setRlt_value(tsRealtime.getRlt_value());
            LocalDateTime localDateTime = LocalDateTime.now();
            tsRealtimeCensor.setRlt_timestamp(localDateTime);
            tsRealtimeCensorRepository.save(tsRealtimeCensor);
            return new DtoResponse(200, tsRealtime, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse (500, tsRealtime, mCreateFailed);
        }
    }


}
