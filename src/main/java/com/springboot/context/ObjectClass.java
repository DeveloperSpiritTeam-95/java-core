package com.springboot.context;

import java.util.*;

/**
 * @author prabhakar, @Date 12-03-2025
 */

public class ObjectClass {

    public static void main(String[] args) {

        Map<String, Object> requestBody = new HashMap<>();
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("18688888888");
        phoneNumbers.add("23374859569");
        phoneNumbers.add("3244242424");

        requestBody.put("phoneNumbers", phoneNumbers);
        requestBody.put("Text", "Hello World");
        requestBody.put("Numbers",phoneNumbers);
        requestBody.put("SenderId", "Sender Id");
        requestBody.put("DRNotifyUrl", "DR Notify Url");
        requestBody.put("DRNotifyHttpMethod", "POST"); // Default value
        requestBody.put("Tool", "API"); // Default value

        System.out.println(requestBody.get("Numbers"));

        String numbers = requestBody.get("Numbers").toString();

        System.out.println(numbers);
        numbers = numbers.replace(",", "");
        System.out.println(numbers);
        numbers = numbers.replace("[", "");
        System.out.println(numbers);
        numbers = numbers.replace("]", "");
        System.out.println(numbers);
       List<String> numbersList = List.of(numbers.split(" "));
       System.out.println(numbersList);
        System.out.println(numbersList.size());
       for (String number : numbersList) {
           System.out.println(number);
       }

        // "ApiId": "16cf077b-d5f0-479d-bb44-aec79660a323",
        //    "MessageUUIDs": "bad3cfd0-e0a5-4886-aa0b-ba5aa99173df,f52960bd-8fde-456d-a576-4dd7eb440311,ff2b7bb9-29e0-4f01-98d9-629bc82379ef,1a8007d5-930b-4187-aaa8-4258f8d432ea",
        //    "Message": "Insufficient funds",
        //    "Success": "False"

    }
}