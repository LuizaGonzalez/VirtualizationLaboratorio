package co.edu.eci.virtualizationlaboratorio;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author luiza.gonzalez-v
 */
@RestController
public class HelloRestController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}
 
