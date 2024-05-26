package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/document")
public class DocumentController {

    Random r = new Random();
    @PostMapping("/upload")
    public int uploadDocument() {
        return r.nextInt(100000);
    }
}
