package com.HEI.base.endpoint.rest.controller;

import com.HEI.base.PojaGenerated;
import com.HEI.base.conf.FacadeIT;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@PojaGenerated
public class BigSumControllerIT extends FacadeIT {
    @Autowired
    BigSumController bigSumController;
    @Test
    public void calculateBigSum(){
        BigInteger a=BigInteger.valueOf(30000);
        BigInteger b=BigInteger.valueOf(5000999);
        BigInteger expectedSum=BigInteger.valueOf(5030999);
       BigInteger sum= bigSumController.calculatebigSum(a,b);
        assertEquals(expectedSum,sum);
    }
}
