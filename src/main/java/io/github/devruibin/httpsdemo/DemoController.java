package io.github.devruibin.httpsdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

        @RequestMapping("/hello")
        public ResponseEntity<UserDemo> hello() {
            return ResponseEntity.ok(UserDemo.builder()
                    .name("ruibin")
                    .age(18)
                    .id(1L).build());
        }
}
