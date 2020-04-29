package server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhm
 * @Description:
 * @date 2020/4/24 14:25
 */
@RequestMapping("/dept")
@RestController
public class DeptController {

    @RequestMapping("/getDept")
    public String getDept(){
        return "hello hello";
    }
}
