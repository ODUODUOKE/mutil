package org.wo0ow.com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wo0ow.com.model.DemoRespDTO;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@Slf4j
public class MutilDesensitization {
        public static void main(String[] args) {
            SpringApplication.run(MutilDesensitization.class, args);
        }


        @RequestMapping("/test/query")
        public Map<String,Object> TestQuery(){

            DemoRespDTO demoRespDTO = new DemoRespDTO();
            demoRespDTO.setPassword("123456789");
            demoRespDTO.setCustomValue("sdfjlas;dfkasf;a");
            demoRespDTO.setPhone("17782349591");
            demoRespDTO.setUserName("发看可");
            demoRespDTO.setIdCard("500393988909878998");

            Map<String,Object> map = new HashMap<>();
            map.put("dto",demoRespDTO);

            log.info("打印日志demoRespDTO:{}",demoRespDTO);

            return map;
        }


}