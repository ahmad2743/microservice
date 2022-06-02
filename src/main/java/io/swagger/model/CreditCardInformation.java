package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-26T20:28:47.813Z")


public class CreditCardInformation   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("cvv")
  private Integer cvv = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  public CreditCardInformation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CreditCardInformation cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CreditCardInformation cvv(Integer cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * Get cvv
   * @return cvv
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCvv() {
    return cvv;
  }

  public void setCvv(Integer cvv) {
    this.cvv = cvv;
  }

  public CreditCardInformation expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreditCardInformation ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInformation creditCardInformation = (CreditCardInformation) o;
    return Objects.equals(this.id, creditCardInformation.id) &&
        Objects.equals(this.cardNumber, creditCardInformation.cardNumber) &&
        Objects.equals(this.cvv, creditCardInformation.cvv) &&
        Objects.equals(this.expirationDate, creditCardInformation.expirationDate) &&
        Objects.equals(this.ownerName, creditCardInformation.ownerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardNumber, cvv, expirationDate, ownerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInformation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

