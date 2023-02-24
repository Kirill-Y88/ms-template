package y88.kirill.msclienthystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientHystrixController {

    private List<String> list;

    public ClientHystrixController() {
        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

    }


    @GetMapping("/all")
    List<String> getAll(){
        return list;
    }





}
