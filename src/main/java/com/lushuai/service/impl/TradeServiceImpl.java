package com.lushuai.service.impl;

import com.lushuai.dao.TradeDao;
import com.lushuai.service.TradeService;
import com.lushuai.vo.VTradeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {
   @Autowired
    private TradeDao tradeDao ;
    @Override
    public List<VTradeInfo> findAllTrades(Date beginTime,Date endTime) {
        List<VTradeInfo> all = tradeDao.findAll(beginTime,endTime);
        return all;
    }
}
