public class ContactController {
    @RestController
@RequestMapping("/api")
public class ContactController {
    @GetMapping("/contact")
    public ResponseEntity<String> getContactInfo() {
        return ResponseEntity.ok("Your Contact Information Here");
    }
}
}
