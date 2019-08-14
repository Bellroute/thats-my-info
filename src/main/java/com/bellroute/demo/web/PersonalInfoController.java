package com.bellroute.demo.web;

import com.bellroute.demo.dto.PersonalInfoDTO;
import com.bellroute.demo.service.PersonalInfoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfoController {
    private final PersonalInfoService personalInfoService;

    public PersonalInfoController(PersonalInfoService personalInfoService) {
        this.personalInfoService = personalInfoService;
    }

    @GetMapping("/personal-info")
    public ResponseEntity<Void> searchInfo(@RequestBody PersonalInfoDTO personalInfoDTO) {

        personalInfoService.search(personalInfoDTO);

        return makeResponseEntity(HttpStatus.FOUND);
    }

    @PostMapping("/measure")
    public ResponseEntity<Void> takeMeasures() {

        //TODO 노출된 개인정보 조치 기능 구현

        return makeResponseEntity(HttpStatus.OK);
    }

    private ResponseEntity<Void> makeResponseEntity(HttpStatus status) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(headers, status);
    }
}
