package com.example.demo;

import org.springframework.stereotype.Service;

@Service //CRUD 하는 곳 //사용자 요청에 대한.. 문제를 해결 할 수 있는 기능이 짜여있으면 됨
public class TestService {
    public String write(){

        return "test를 서비스를 이용해 출력";
    }
}
