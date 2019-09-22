package site.ilemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/article/callUsers")
    public List<User> getUserList(){
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8081/users",List.class);
        List<User> users = responseEntity.getBody();
        return users;
    }
}
