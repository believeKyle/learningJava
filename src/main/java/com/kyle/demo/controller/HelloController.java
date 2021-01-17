package com.kyle.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kk")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/kyle")
    public String kyle( String from){
        logger.error(from);
        String path = System.getProperty("user.home");
        return "from :"+from+"----size:";
    }

    @RequestMapping(value="/hello/{id}/{name}",method= RequestMethod.GET)
    public String sayHello(@PathVariable("id") Integer id,@PathVariable("name") String name){
        return "id:"+id+" name:"+name;
    }

    //@ResponseBody
    /*@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    String hello(@PathVariable("name") String name) {
        return "hello " + name;
    }*/

    /*@RequestMapping("/show5/{id}/{name}")
    public String test(@PathVariable("id") String id, @PathVariable("name") String name){
        return id+" ---- "+name;
    }*/
}
