package com.csh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csh
 * @version 1.0
 * @date 2020/4/20
 * @package com.csh.controller
 */
@RestController
public class TestController2 {

    @RequestMapping("/getMap")
    public Map<String,String> getMap(){
        Map<String,String> maps=new HashMap<>();
        maps.put("first","11111111111");
        maps.put("second","22222222222");
        maps.put("third","333333333333");
        return maps;
    }
}
