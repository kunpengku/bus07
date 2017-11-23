package com.kunpengku.bus07.controller;

import com.kunpengku.bus07.service.Bus03Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 17/11/23.
 *
 * @author fupeng.
 */
@RestController
public class B7Controller {

    @Autowired
    Bus03Feign bus03Feign;

    @RequestMapping("/get03")
    String getFrom03(){
        String s = bus03Feign.getInfo();
        System.out.println(s);

        return s;
    }

}
