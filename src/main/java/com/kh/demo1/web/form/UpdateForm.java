package com.kh.demo1.web.form;

import lombok.Data;

@Data
public class UpdateForm {
  private Long productId;
  private String pname;
  private Long quantity;
  private Long price;
}