package io.oasp.application.mtsj.dishmanagement.common.api;

import java.math.BigDecimal;

import io.oasp.application.mtsj.general.common.api.ApplicationEntity;
import io.oasp.application.mtsj.imagemanagement.common.api.Image;

public interface Dish extends ApplicationEntity {

  public String getName();

  public void setName(String name);

  public String getDescription();

  public void setDescription(String description);

  public BigDecimal getPrice();

  public void setPrice(BigDecimal price);

  public Long getIdImage();

  public void setIdImage(Long idImage);

  public Image getImage();

  public void setImage(Image image);

}
