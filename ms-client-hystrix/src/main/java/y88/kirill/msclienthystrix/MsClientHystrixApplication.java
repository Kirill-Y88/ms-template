package y88.kirill.msclienthystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "y88.kirill.feign")
public class MsClientHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsClientHystrixApplication.class, args);
    }

}
