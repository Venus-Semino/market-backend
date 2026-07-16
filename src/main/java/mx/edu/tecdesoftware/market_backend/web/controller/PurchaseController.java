package mx.edu.tecdesoftware.market_backend.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import mx.edu.tecdesoftware.market_backend.domain.Purchase;
import mx.edu.tecdesoftware.market_backend.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
@Tag(name = "Purchase", description = "Manage purchases in the storage")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    @Operation(
            summary = "Get all purchases",
            description = "Return all list of all available purchases")
    @ApiResponse(
            responseCode = "500", description = "Internal server error" )
    public ResponseEntity<List<Purchase>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{id}")
    @Operation(
            summary = "Get purchase by client Id",
            description = "Return a purchase by its client ID if it exists" )
    @ApiResponse( responseCode = "200", description = "Purchase found" )
    @ApiResponse( responseCode = "404", description = "Purchase not found" )
    @ApiResponse( responseCode = "500", description = "Internal server error" )
    public ResponseEntity<Purchase> getByCliente(@Parameter(description = "ID of the client retrieved", example = "39404", required = true)@PathVariable("id") String clientId) {
        return purchaseService.getByClientId(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/save")
    @Operation(
            summary = "Save a new purchase",
            description = "Register a new purchase and return the created purchase",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    required = true,
                    content = @Content(
                            examples = @ExampleObject(
                                    name = "Example purchase",
                                    value = """
                                            {
                                            "clientId": "2552243",
                                            "paymentMethod": "E",
                                            "comment": "string",
                                            "state": "p",
                                            "items": [
                                            {
                                            "productId": 5,
                                            "amount": 1,
                                            "total": 4000,
                                            "active": true
                                            }
                                            ]
                                            }
                                            """
                            )
                    )
            )
    )
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }
}