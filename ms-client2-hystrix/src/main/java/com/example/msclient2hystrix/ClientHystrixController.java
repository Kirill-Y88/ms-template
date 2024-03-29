package com.example.msclient2hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import y88.kirill.feign.HClient1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class ClientHystrixController {

    private List<String> list;
    private RestTemplate restTemplate;

    @Autowired
    private HClient1 hClient1;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public ClientHystrixController() {
        list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

    }


    @GetMapping("/all")
    List<String> getAll(){
        return list;
    }


    @GetMapping("all2")
    List<String> getAll2(){
        List<String> tempString = new ArrayList<>(list);
        List<String> anotherList = restTemplate.getForObject("http://ms-client-hystrix/client1/all", List.class);
        System.out.println(anotherList.toString());
        tempString.addAll(anotherList);
        return tempString;
    }

    @GetMapping("all3")
    List<String> getAll3(){
        List<String> tempString = new ArrayList<>(list);
        List<String> anotherList = hClient1.getAll();
        System.out.println(anotherList.toString());
        tempString.addAll(anotherList);
        return tempString;
    }



}
