// com.example.pricingapi.repository/PricingRepository.java

package com.example.pricingapi.repository;

import com.example.pricingapi.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Pricing, Long> {

}