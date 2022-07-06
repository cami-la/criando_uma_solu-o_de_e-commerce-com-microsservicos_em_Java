package br.hatanaka.ecommerce.checkout.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CheckoutEntity {
  @Id
  private Long id;
  private String code;
}
