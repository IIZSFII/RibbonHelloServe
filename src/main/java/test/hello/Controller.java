package test.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("ribbon/")
public class Controller {

@Autowired
RestTemplate restTemplate;
@RequestMapping("/findLottery")
public String findLottery(){
    System.out.println("foundlottery-----------------------------");
    return  restTemplate.getForEntity("http://LOTTERY-SERVER/lottery/hello",String.class).getBody();
    }
}
