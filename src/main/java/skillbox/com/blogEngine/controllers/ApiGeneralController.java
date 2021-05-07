package skillbox.com.blogEngine.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/")
public class ApiGeneralController {

    @GetMapping("init")
    public ResponseEntity init(){
        HashMap<String, String> body = new HashMap<>();
        body.put("title", "DevPub");
        body.put("subtitle", "Рассказы разработчиков");
        body.put("phone", "+7 903 666-44-55");
        body.put("email", "mail@mail.ru");
        body.put("copyright", "Дмитрий Сергеев");
        body.put("copyrightFrom", "2005");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("settings")
    public ResponseEntity settings(){
        HashMap<String, String> body = new HashMap<>();
        body.put("MULTIUSER_MODE", "false");
        body.put("POST_PREMODERATION", "true");
        body.put("STATISTICS_IS_PUBLIC", "true");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

    @GetMapping("tag")
    public ResponseEntity tag(){
        HashMap<String, String> body = new HashMap<>();
        body.put("tags", "[{\"name\":\"Java\", \"weight\":1}," +
                "{\"name\":\"Spring\", \"weight\":0.56}," +
                "{\"name\":\"Hibernate\", \"weight\":0.22}," +
                "{\"name\":\"Hadoop\", \"weight\":0.17},]");
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
