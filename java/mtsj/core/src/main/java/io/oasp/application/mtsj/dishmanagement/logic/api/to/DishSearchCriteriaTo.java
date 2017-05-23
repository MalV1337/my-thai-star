package io.oasp.application.mtsj.dishmanagement.logic.api.to;

import java.math.BigDecimal;

import io.oasp.application.mtsj.imagemanagement.common.api.Image;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link io.oasp.application.mtsj.dishmanagement.common.api.Dish}s.
 *
 */
public class DishSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private BigDecimal price;

  private Long idImage;

  private Image image;

  /**
   * The constructor.
   */
  public DishSearchCriteriaTo() {

    super();
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getDescription() {

    return this.description;
  }

  public void setDescription(String description) {

    this.description = description;
  }

  public BigDecimal getPrice() {

    return this.price;
  }

  public void setPrice(BigDecimal price) {

    this.price = price;
  }

  public Long getIdImage() {

    return this.idImage;
  }

  public void setIdImage(Long idImage) {

    this.idImage = idImage;
  }

  public Image getImage() {

    return this.image;
  }

  public void setImage(Image image) {

    this.image = image;
  }

}
