package skillbox.com.blogEngine.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/auth")
public class ApiAuthController {

    @GetMapping("/check")
    public ResponseEntity check(){
        HashMap<String, String> body = new HashMap<>();
        body.put("result", "false");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
