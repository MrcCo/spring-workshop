package com.mrcco.workshop.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class House {

  @Id
  private Long id;
  private String street;
  private Long number;

}
