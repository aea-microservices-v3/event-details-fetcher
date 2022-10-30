package com.aea.microservices.eventdetailsfetcher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails
{
	private String productId;
	private String productName;
	private String productDescription;
}
