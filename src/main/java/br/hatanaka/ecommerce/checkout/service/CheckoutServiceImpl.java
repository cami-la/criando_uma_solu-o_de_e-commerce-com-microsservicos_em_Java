package br.hatanaka.ecommerce.checkout.service;

import br.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import br.hatanaka.ecommerce.checkout.repository.CheckoutRepository;
import br.hatanaka.ecommerce.checkout.resource.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public record CheckoutServiceImpl(
    CheckoutRepository checkoutRepository
) implements ICheckoutService {
  @Override
  public Optional<CheckoutEntity> create(CheckoutRequest CheckoutRequest) {
    return Optional.empty();
  }
}
