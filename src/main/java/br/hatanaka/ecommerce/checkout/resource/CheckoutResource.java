package br.hatanaka.ecommerce.checkout.resource;

import br.hatanaka.ecommerce.checkout.streaming.CheckoutCreatedSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/checkout")
@RestController
public record CheckoutResource(
    CheckoutCreatedSource checkoutCreatedSource
) {

  @PostMapping
  public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
    return ResponseEntity.ok().build();
  }

}
