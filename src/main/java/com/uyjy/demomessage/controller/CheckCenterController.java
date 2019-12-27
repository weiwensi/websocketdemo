package com.uyjy.demomessage.controller;

import com.uyjy.demomessage.web.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/mywebsocket")
public class CheckCenterController {

   /* //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav=new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }*/
    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket")
    public String pushToWeb() {
        try {
            String  message = "hello";
            String  cid = "1212";
            System.out.println(message);
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }
} 