package fast.campus.fcss01.controller;

import fast.campus.fcss01.user.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/v1/hello")
    public String hello() {
        return "hello spring security";
    }

    @GetMapping("/api/v2/hello")
    public ResponseEntity<Person> helloV2() {
        return ResponseEntity.ok(new Person("2", 1));
    }
}