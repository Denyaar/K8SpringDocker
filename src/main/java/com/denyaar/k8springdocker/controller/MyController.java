/**
 * Created by tendaimupezeni for K8SpringDocker
 * Date: 8/13/24
 * Time: 1:15 AM
 */

package com.denyaar.k8springdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test-docker")
    public String getData(){
        return "Hello from K8SpringDocker";
    }
}
