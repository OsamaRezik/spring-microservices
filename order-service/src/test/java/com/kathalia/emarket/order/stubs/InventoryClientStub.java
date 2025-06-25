package com.kathalia.emarket.order.stubs;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;


public class InventoryClientStub {
    public static void stubInventoryCall(String skuCode,Integer quantity){
        stubFor(get(urlEqualTo("/api/inventory?skuCode="+skuCode+"&quantity="+quantity))
                .willReturn(aResponse()
                        .withStatus(200)
                                .withHeader("content-type","application/json")
                                .withBody("true"))

        );
    }
}
