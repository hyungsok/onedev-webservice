package com.onedev.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 메인 클래스
 * - @SpringBootApplication 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치
 * - 멀티 모듈을 이용한다면 해당 Application 클래시 위치부터 아래로 패키지 스캔을 하기 때문에 주의가 필요
 */
@SpringBootApplication // --> 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
@EnableJpaAuditing // --> JPA Auditing 활성화
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
