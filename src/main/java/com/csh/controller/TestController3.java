package com.csh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author csh
 * @version 1.0
 * @date 2020/4/20
 * @package com.csh.controller
 */
@RestController
public class TestController3 {

    @RequestMapping("/testBranch")
    public String testBranch() {
        return "branch";
    }
}
