package com.linshang.code.generator.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BuilderController {



    @RequestMapping("/code/demo")
    public ModelAndView demo() {
        ModelAndView view = new ModelAndView("default/demo");
        return view;
    }

    @RequestMapping("/code/build/model")
    public ModelAndView modelCode() {
        ModelAndView view = new ModelAndView("default/model");
        view.addObject("package_name", "com.linshang.model");
        view.addObject("table_annotation", "com.linshang.model");
        view.addObject("author", "com.linshang.model");
        return view;
    }



}
