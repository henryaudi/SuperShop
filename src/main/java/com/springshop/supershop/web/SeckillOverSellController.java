package com.springshop.supershop.web;

import com.springshop.supershop.db.dao.SeckillActivityDao;
import com.springshop.supershop.service.SeckillOverSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillOverSellController {

    @Autowired
    private SeckillOverSellService seckillOverSellService;

    @ResponseBody
    @RequestMapping("/seckill/{seckillActivity}")
    public String seckill(@PathVariable long seckillActivity) {
        return seckillOverSellService.processSeckill(seckillActivity);
    }
}
