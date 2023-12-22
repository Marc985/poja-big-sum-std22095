package com.HEI.base.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public BigInteger calculatebigSum(
            @RequestParam(name = "a",defaultValue = "0") BigInteger a,
            @RequestParam(name = "b",defaultValue = "0") BigInteger b
                                      ){

        return a.add(b);
    }

}
