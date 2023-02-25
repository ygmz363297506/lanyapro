package com.example.lanyapro.contraoller;

import com.example.lanyapro.service.LYUserService;
import com.example.lanyapro.vo.TLanyaUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0.0
 * 创建时间：2023/2/25 19:20
 * @Description <p>详细描述
 * @author易港
 */
@RequestMapping("/user")
@RestController
public class LYUserContraoller {

    private static final Logger log = LoggerFactory.getLogger(LYUserContraoller.class);

    @Autowired
    private LYUserService userService;

    @GetMapping("/getUser")
    public String getUser(Integer id) {
        TLanyaUser user = userService.getOne(id);
        String returnNo = user.getUserNo()+user.getUserName();
        log.info("userMSG:" + returnNo);
        return returnNo;
    }
}
