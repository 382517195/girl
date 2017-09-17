package com.imooc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by an on 2017/8/31.
 */
@RestController
/*@ConfigurationProperties(prefix="server")*/
public class HelloController {
/*
    @Value("${server.port}")
    public String cupSize;*/

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String say(){
        return "hellow";
    }
}
