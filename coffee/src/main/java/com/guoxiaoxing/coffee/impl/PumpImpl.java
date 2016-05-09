package com.guoxiaoxing.coffee.impl;

import com.guoxiaoxing.coffee.interfaces.Heater;
import com.guoxiaoxing.coffee.interfaces.Pump;

import javax.inject.Inject;

/**
 * Author: guoxiaoxing
 * Email: guoxiaoxingv@163.com
 * Site:  https://github.com/guoxiaoxing
 * Date: 16/5/9 上午10:43
 * Function:泵浦，Pump的实现类
 * <p/>
 * Modification history:
 * Date                 Author              Version             Description
 * --------------------------------------------------------------------------
 * 16/5/9 上午10:43     guoxiaoxing           1.0
 */
public class PumpImpl implements Pump {

    private final Heater mHeater;

    @Inject
    public PumpImpl(Heater heater) {
        mHeater = heater;
    }

    @Override
    public void pump() {
        if (mHeater.isHot()) {
            System.out.println("coffee maker is pumping");
        }
    }
}