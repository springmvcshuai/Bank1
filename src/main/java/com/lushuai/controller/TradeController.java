package com.lushuai.controller;

import com.lushuai.common.JsonResult;
import com.lushuai.service.TradeService;
import com.lushuai.vo.VTradeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @RequestMapping("/list.do")
    @ResponseBody
    public JsonResult listTradeInfo(@DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime, @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime){
        List<VTradeInfo> list = tradeService.findAllTrades(beginTime, endTime);
        JsonResult result = new JsonResult(1, list);
        System.out.println("yiadd  no commit");
        return result;
    }
}
