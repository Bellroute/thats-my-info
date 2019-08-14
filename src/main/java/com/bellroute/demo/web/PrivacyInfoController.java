package com.bellroute.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivacyInfoController {

    @GetMapping("/info/privacy")
    public void showPrivacyInfo() {
        //TODO DB에서 '개인정보란' 추출 기능 구현
    }

    @PostMapping("/info/privacy")
    public void writePrivacyInfo() {
        //TODO DB에 '개인정보란' 입력 기능 구현
    }

    @GetMapping("/info/privacy-rules")
    public void showPrivacyRules() {
        //TODO DB에서 '개인정보보호 관련 법제' 추출 기능 구현
    }

    @PostMapping("/info/privacy-rules")
    public void writePrivacyRules() {
        //TODO DB에 '개인정보보호 관련 법제' 입력 기능 구현
    }

    @GetMapping("/info/privacy-use-rules")
    public void showPrivacyRulesOfUse() {
        //TODO DB에서 '개인정보보호 이용 수칙' 추출 기능 구현
    }

    @PostMapping("/info/privacy-use-rules")
    public void writePrivacyRulesOfUse() {
        //TODO DB에 '개인정보보호 관련 법제' 입력 기능 구현
    }

    @GetMapping("/info/privacy-campaign")
    public void showPrivacyCampaign() {
        //TODO DB에서 '내 정보 지킴이 캠페인' 추출 기능 구현
    }

    @PostMapping("/info/privacy-campaign")
    public void writePrivacyCampaign() {
        //TODO DB에 '내 정보 지킴이 캠페인' 입력 기능 구현
    }

}
