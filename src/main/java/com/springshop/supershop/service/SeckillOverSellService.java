package com.springshop.supershop.service;

import com.springshop.supershop.db.dao.SeckillActivityDao;
import com.springshop.supershop.db.po.SeckillActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeckillOverSellService {

    @Autowired
    private SeckillActivityDao seckillActivityDao;

    public String processSeckill(long acticityId) {
        SeckillActivity activity = seckillActivityDao.querySeckillActivityById(acticityId);
        int availableStock = activity.getAvailableStock();
        String result;

        if (availableStock > 0) {
            result = "Success! Order was placed successfully!";
            System.out.printf(result);
            availableStock -= 1;
            activity.setAvailableStock(availableStock);
            seckillActivityDao.updateSeckillActivity(activity);
        } else {
            result = "Sorry, item is out of stock!";
            System.out.println(result);
        }

        return result;
    }
}
