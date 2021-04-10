package com.lushuai.service;

import com.lushuai.vo.VTradeInfo;

import java.util.Date;
import java.util.List;

public interface TradeService {
    public List<VTradeInfo> findAllTrades(Date beginTime, Date endTime);
}
