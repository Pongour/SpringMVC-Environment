package com.shsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("hi")
public class HelloController {

    @RequestMapping("hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello springmvc");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("model02")
    public ModelAndView model02(ModelMap modelMap) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("model");
        modelMap.addAttribute("m01","m02");
        return mv;
    }

    @RequestMapping("model03")
    public ModelAndView model03(Map map){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("model");
        map.put("m01","m03");
        return mv;

    }

    @RequestMapping("model04")
    public ModelAndView model04(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("model");
        model.addAttribute("m01","m04");
        return mv;
    }

    @RequestMapping("model05")
    public ModelAndView model05(HttpServletRequest httpServletRequest) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("model");
        httpServletRequest.setAttribute("m01","m05");
        return mv;
    }

    @RequestMapping("model06")
    public String model06(Model model) {
        model.addAttribute("m01","m06");
        return "model";
    }

}
