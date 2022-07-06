package br.hatanaka.ecommerce.checkout.service;

import br.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import br.hatanaka.ecommerce.checkout.resource.CheckoutRequest;
import org.springframework.boot.web.embedded.jetty.ConfigurableJettyWebServerFactory;

import java.util.Optional;

public interface ICheckoutService {
  Optional<CheckoutEntity> create(CheckoutRequest CheckoutRequest);

}
