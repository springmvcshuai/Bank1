package com.lushuai.dao;

import com.lushuai.vo.VTradeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TradeDao {
    public List<VTradeInfo> findAll(@Param("beginTime")Date beginTime ,@Param("endTime") Date endTime);
}
