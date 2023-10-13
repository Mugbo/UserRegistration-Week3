package ie.atu.userregistration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "confirmation-service", url = "http://localhost:8082")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}