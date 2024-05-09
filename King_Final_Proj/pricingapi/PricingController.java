public class PricingController {

    private final PricingService pricingService;

    public PricingController(PricingService pricingService) {
        this.pricingService = pricingService;
    }

    @GetMapping("/api/pricing")
    public List<Pricing> getPricing() {
        return pricingService.listAll();
    }
}