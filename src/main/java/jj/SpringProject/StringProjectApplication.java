package jj.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class StringProjectApplication {
        public static void main(String[] args) {
                SpringApplication.run(StringProjectApplication.class, args);
        }
        

        @RequestMapping("/")
        public String hello() { // 3
                return "Hello person viewing this page! wazzzup!";
        }
        @RequestMapping("/random")
        public String random() { // 3
                return "Spring boot is super cool!";
        }
}
