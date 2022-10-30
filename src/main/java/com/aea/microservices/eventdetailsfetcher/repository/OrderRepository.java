package com.aea.microservices.eventdetailsfetcher.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aea.microservices.eventdetailsfetcher.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>
{

}
