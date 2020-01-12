package com.ldh.jy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    /* 메인 클래스 */
    /* @SpringBootApplication을 기준으로 설정을 읽기 때문에 프로젝트의 최상단에 이 클래스가 위치해야함. */
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);// 내장 WAS를 실행
    }
}
