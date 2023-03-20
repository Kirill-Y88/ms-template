package y88.kirill.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value ="ms-client-hystrix" , path = "/client1")
public interface HClient1 {

    @GetMapping("/all")
    List<String> getAll();

}
