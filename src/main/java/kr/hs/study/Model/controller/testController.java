package kr.hs.study.Model.controller;

import kr.hs.study.Model.dto.test4;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req, Model model){
        String d1 = req.getParameter("data1");
        String d2 = req.getParameter("data2");

        model.addAttribute("data1", d1);
        model.addAttribute("data2", d2);

        return "result";
    }

    @GetMapping("/test2/{d1}/{d2}")
    public String test2(@PathVariable int d1, @PathVariable int d2, Model model){

        model.addAttribute("data1", d1);
        model.addAttribute("data2", d2);

        return "result";
    }

    @GetMapping("/test3")
    public String test3(@RequestParam("data1") int d1,
                        @RequestParam("data2") int d2,
                        Model model){

        model.addAttribute("data1", d1);
        model.addAttribute("data2", d2);

        return "result";
    }

    @GetMapping("/test4")
    public String test4(@ModelAttribute test4 dto, Model model){
        model.addAttribute("data1", dto.getData1());
        model.addAttribute("data2", dto.getData2());


        return "result";
    }
}
