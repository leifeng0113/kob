package com.thelastbot.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController

@RequestMapping("/pk/")
public class BotInfoController {




@RequestMapping("getbotinfo/")
public Map<String,String> getBotInfo(){
    Map<String,String>bot1=new HashMap<>();
    bot1.put("name","saber");
    bot1.put("rating","1500");
    return bot1;

    }
}

