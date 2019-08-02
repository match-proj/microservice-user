//package com.match.user.client;
//
//import com.match.user.client.bean.PeopleDTO;
//import com.match.user.client.configuration.FeignSupportConfig;
//import com.match.user.client.fallback.UserClientFallbackImpl;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Optional;
//
///**
// * @Author zhangchao
// * @Date 2019/7/31 17:28
// * @Version v1.0
// */
//@FeignClient(name = "microservice-user",configuration = FeignSupportConfig.class, fallback = UserClientFallbackImpl.class)
//public interface UserClientDemo {
//
//    @GetMapping("/user/findNameByUserId")
//    String findNameByUserId(@RequestParam("userId") String userId);
//
//    @GetMapping("/user/getPeopleIdByAccessToken")
//    Optional<String> getPeopleIdByAccessToken(@RequestParam("token") String token);
//
//    @GetMapping("/user/findPeipleById")
//    PeopleDTO findPeipleById(@RequestParam("peopleId") String peopleId);
//}