package com.kathalia.emarket.order;

import com.kathalia.emarket.order.stubs.InventoryClientStub;
import io.restassured.RestAssured;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MySQLContainer;

import static org.hamcrest.MatcherAssert.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWireMock(port = 0)
class OrderServiceApplicationTests {

	@Autowired
	MySQLContainer mySQLContainer;



	@LocalServerPort
	private Integer port;

	@BeforeEach
	void setup(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port=port;
		mySQLContainer.start();
	}

	@Test
	void shouldPlaceOrder() {
		String requestBody="""
				{
					  "skuCode": "Iphone_15",
				      "price":1500,
				      "quantity":10
				}
		""";
		InventoryClientStub.stubInventoryCall("Iphone_15",10);
	var responseBodyString=	RestAssured.given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.post("/api/order")
				.then()
				.log().all()
				.statusCode(201)
				.extract().body().asString();
	assertThat(responseBodyString,Matchers.is("Order Placed Successfully"));
	}

}
