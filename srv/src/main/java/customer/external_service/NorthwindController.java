package customer.external_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/northwind")
public class NorthwindController {

    private static final Logger logger = LoggerFactory.getLogger(NorthwindController.class);

    @Autowired
    private NorthwindService northwindService;

    @GetMapping("/products")
    public CompletableFuture<String> getProducts() {
        return northwindService.getProducts()
                .thenApply(response -> {
                    // Log the response in the console
                    logger.info("Response from NorthwindService: {}", response);
                    return response;
                });
    }
}

