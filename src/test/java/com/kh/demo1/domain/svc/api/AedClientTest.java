//package com.kh.demo1.domain.svc.api;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@Slf4j
//@SpringBootTest
//public class AedClientTest {
//
//  private WebClient webClient;
//
//  @Autowired
//  public AedClientTest(WebClient.Builder webClientBuilder) {
//    String url = "http://apis.data.go.kr";
//    this.webClient = webClientBuilder.baseUrl(url).build();
//  }
//
//  @Test
//  void t1(){
//    Mono<String> responseMono = webClient.get()
//        .uri(uriBuilder -> uriBuilder
//            .path("/B552657/AEDInfoInqireService/getAedLcinfoInqire")
//            .queryParam("serviceKey", "bJ0AcEWnYARdHMe24EsPd77ralP%2BiRWLuhIeWgoIBgM%2F4dqlAgbS%2FilwgSiZkbkL9ojCBQHuEZI2TtoMqYzRhA%3D%3D")
//            .queryParam("WGS84_LON", 129.3076)
//            .queryParam("WGS84_LAT",35.53235)
//            .queryParam("pageNo",1)
//            .queryParam("numOfRows",10)
//            .build())
//        .retrieve()
//        .bodyToMono(String.class);
//    String res = responseMono.block();
//    log.info("res={}", res);
//  }
//
//}