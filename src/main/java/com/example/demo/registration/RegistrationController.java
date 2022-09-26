package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping(path = "api/")
@AllArgsConstructor
public class RegistrationController {

    final RegistrationService registrationService;

    @PostMapping(path = "/login")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

}
