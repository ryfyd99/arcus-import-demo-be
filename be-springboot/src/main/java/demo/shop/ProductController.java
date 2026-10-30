package demo.shop;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<String> products() {
        return List.of("keyboard", "mouse", "monitor");
    }
}
