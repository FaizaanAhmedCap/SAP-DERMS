package customer.external_service;

import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

@Service
public class NorthwindService {

    private static final Logger logger = LoggerFactory.getLogger(NorthwindService.class);

    /**
     * Fetches products from the Northwind service asynchronously.
     * @return a CompletableFuture containing the products as a String.
     */
    public CompletableFuture<String> getProducts() {
        try {
            // Retrieve the HTTP destination configuration for the Northwind service
            HttpDestination destination = DestinationAccessor.getDestination("Northwind").asHttp();
            String northwindUrl = destination.getUri().toString() + "/Products";

            // Log the URL being used
            logger.info("Fetching products from URL: {}", northwindUrl);

            // Create a new HTTP client
            HttpClient client = HttpClient.newHttpClient();
            
            // Build the HTTP request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(northwindUrl))
                    .header("Accept", "application/json")
                    .build();

            // Send the HTTP request asynchronously and handle the response as a string
            return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(response -> {
                        // Log the response status code and body
                        logger.info("Response status code: {}", response.statusCode());
                        logger.info("Response body: {}", response.body());
                        return response.body();
                    })
                    .exceptionally(ex -> {
                        // Log any exceptions that occur
                        logger.error("Error fetching products: ", ex);
                        return "Error fetching products: " + ex.getMessage();
                    });
        } catch (Exception e) {
            logger.error("Exception occurred while fetching products: ", e);
            return CompletableFuture.completedFuture("Exception occurred while fetching products: " + e.getMessage());
        }
    }
}
