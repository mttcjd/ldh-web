package com.ldh.jy.springboot.domain.posts;

import com.ldh.jy.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter// getter 자동 생성
@NoArgsConstructor// 기본 생성자 자동 추가
@Entity
public class Posts extends BaseTimeEntity {
    /* 실제 DB 테이블과 매칭될 클래스 (Entity 클래스)*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// PK생성규칙. 옵션 : auto increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        System.out.println("here : "+title);
        this.title = title;
        this.content = content;
    }

}
