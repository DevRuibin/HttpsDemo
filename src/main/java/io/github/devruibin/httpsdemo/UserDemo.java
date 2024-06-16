package io.github.devruibin.httpsdemo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class UserDemo {
    private String name;
    private int age;
    private Long id;
}
