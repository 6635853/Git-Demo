package com.csh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csh
 * @version 1.0
 * @date 2020/4/20
 * @package com.csh.controller
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    @RequestMapping("/test2")
    public List<String> getList(){
        List<String> lists=new ArrayList<>();
        lists.add(" first ");
        lists.add(" second ");
        lists.add(" thired ");
        return lists;
    }
}
