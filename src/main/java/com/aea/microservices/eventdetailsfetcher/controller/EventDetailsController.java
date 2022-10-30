package com.aea.microservices.eventdetailsfetcher.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aea.microservices.eventdetailsfetcher.model.Order;
import com.aea.microservices.eventdetailsfetcher.repository.OrderRepository;

@RestController
@RequestMapping("/event-details")
public class EventDetailsController
{
	
	private static Logger LOG = LoggerFactory.getLogger(EventDetailsController.class);
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping("/{orderId}")
	public Order getEventDetails(@PathVariable final String orderId)
	{
		LOG.info("Fetching the order event details => {}", orderId);
		return orderRepository.findById(orderId).get();
	}
	
}
