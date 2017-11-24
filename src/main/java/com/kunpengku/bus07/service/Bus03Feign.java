package com.kunpengku.bus07.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description
 * <p>
 * </p>
 * DATE 17/11/23.
 *
 * @author fupeng.
 */
@FeignClient(name = "bus03")
public interface Bus03Feign {

    @RequestMapping("/bus")
    String getInfo();

}
