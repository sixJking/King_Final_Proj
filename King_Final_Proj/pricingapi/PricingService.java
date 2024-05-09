package com.example.pricingapi.service;

import com.example.pricingapi.model.Pricing;
import com.example.pricingapi.repository.PricingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PricingService {

    private final PricingRepository pricingRepository;

    public PricingService(PricingRepository pricingRepository) {
        this.pricingRepository = pricingRepository;
    }

    public List<Pricing> getAllPricings() {
        return pricingRepository.findAll();
    }

}