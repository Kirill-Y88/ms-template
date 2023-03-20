package y88.kirill.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value ="ms-client2-hystrix" , path = "/client2")
public interface HClient2 {

    @GetMapping("/all")
    List<String> getAll();

}
