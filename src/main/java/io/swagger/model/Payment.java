package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CreditCardInformation;
import io.swagger.model.PaymentOrder;
import io.swagger.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-26T20:28:47.813Z")


public class Payment   {
  @JsonProperty("buyer_info")
  private User buyerInfo = null;

  @JsonProperty("checkout_id")
  private String checkoutId = null;

  @JsonProperty("creditCardInfo")
  private CreditCardInformation creditCardInfo = null;

  @JsonProperty("paymentOrders")
  @Valid
  private List<PaymentOrder> paymentOrders = new ArrayList<PaymentOrder>();

  public Payment buyerInfo(User buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

  /**
   * Get buyerInfo
   * @return buyerInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public User getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(User buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public Payment checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   * @return checkoutId
  **/
  @ApiModelProperty(example = "sdsfef1121", required = true, value = "")
  @NotNull


  public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public Payment creditCardInfo(CreditCardInformation creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CreditCardInformation getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCardInformation creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public Payment paymentOrders(List<PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
    return this;
  }

  public Payment addPaymentOrdersItem(PaymentOrder paymentOrdersItem) {
    this.paymentOrders.add(paymentOrdersItem);
    return this;
  }

  /**
   * list of payment
   * @return paymentOrders
  **/
  @ApiModelProperty(required = true, value = "list of payment")
  @NotNull

  @Valid

  public List<PaymentOrder> getPaymentOrders() {
    return paymentOrders;
  }

  public void setPaymentOrders(List<PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.buyerInfo, payment.buyerInfo) &&
        Objects.equals(this.checkoutId, payment.checkoutId) &&
        Objects.equals(this.creditCardInfo, payment.creditCardInfo) &&
        Objects.equals(this.paymentOrders, payment.paymentOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerInfo, checkoutId, creditCardInfo, paymentOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentOrders: ").append(toIndentedString(paymentOrders)).append("\n");
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

