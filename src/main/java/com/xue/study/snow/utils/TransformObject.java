package com.xue.study.snow.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xue.study.snow.dao.User;

import java.io.IOException;

public class TransformObject {
    public static void main(String[] args) throws IOException {
        User user = new User("xiaoli", 12, "123456789");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(user);
        System.out.println("usertoString" + jsonString);
        User user1 = (User) objectMapper.readValue(jsonString, User.class);
        System.out.println(user1.getUsername());
//        int age = 1;
//        switch (age) {
//            case 1:
//                System.out.println("666");
//                break;
//            case 2:
//                System.out.println("999");
//                break;
//            case 3:
//                System.out.println("888");
//                break;
//            default:
//                System.out.println("111");
//        }
//

    }
}
