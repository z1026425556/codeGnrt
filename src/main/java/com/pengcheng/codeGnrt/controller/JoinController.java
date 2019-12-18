package com.pengcheng.codeGnrt.controller;

import com.pengcheng.codeGnrt.domain.Join;
import com.pengcheng.codeGnrt.service.impl.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {

    @Autowired
    private JoinService joinService;

    @RequestMapping("/joinTest")
    public Join joinTest(Long id){
        return joinService.byId(id);
    }


}
