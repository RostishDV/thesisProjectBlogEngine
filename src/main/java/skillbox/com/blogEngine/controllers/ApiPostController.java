package skillbox.com.blogEngine.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/post")
public class ApiPostController {

    @GetMapping("")
    public ResponseEntity getPosts(){
        HashMap<String, String> body = new HashMap<>();
        body.put("count", "1");
        body.put("posts", "[{" +
                "\"id\": 345," +
                "\"timestamp\": 1592338706," +
                "\"user\":" + "{" + "\"id\": 88," + "\"name\": \"Дмитрий Петров\"" + "}," +
                "\"title\": \"Заголовок поста\"," +
                "\"announce\": \"Текст анонса поста без HTML-тэгов\"," +
                "\"likeCount\": 36," +
                "\"dislikeCount\": 3," + "\"commentCount\": 15," +
                "\"viewCount\": 55}]");
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
