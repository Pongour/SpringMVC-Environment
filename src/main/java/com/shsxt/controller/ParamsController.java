package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("params")
public class ParamsController {
    @RequestMapping("param02")
    public void param02(Integer id){
        System.out.println(id);
    }
    @RequestMapping("param04")
    public void param04(Integer [] ids){
        if(ids!=null && ids.length>0) {
            for(Integer id:ids) {
                System.out.println(id);
            }
        }
    }
}
