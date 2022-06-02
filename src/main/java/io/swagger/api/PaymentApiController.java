package io.swagger.api;

import io.swagger.model.CacheRepository;
import io.swagger.model.JedisRepository;
import io.swagger.model.Payment;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import redis.clients.jedis.Jedis;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-26T20:28:47.813Z")

@Controller
public class PaymentApiController implements PaymentApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CacheRepository jedisRepository;

    @Autowired
    public PaymentApiController(ObjectMapper objectMapper, HttpServletRequest request, CacheRepository jedisRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.jedisRepository = jedisRepository;
    }

    public ResponseEntity<Void> addPayment(@ApiParam(value = "Payment object" ,required=true )  @Valid @RequestBody Payment body) {
        String accept = request.getHeader("Accept");
        String checkoutId = body.getCheckoutId().toString();
        String cacheObject = jedisRepository.getById(checkoutId);
        if (cacheObject != null){
            return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED); // request already exist
        }
        jedisRepository.put(checkoutId, body.toString()); // store to redis cache
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED); // procees to payment
    }
}
