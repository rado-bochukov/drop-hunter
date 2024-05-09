package com.example.dropfarmer.web;

import com.example.dropfarmer.model.view.AirdropViewModel;
import com.example.dropfarmer.service.AirdropService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/airdrops")
public class AirdropRestController {

    private final AirdropService airdropService;

    public AirdropRestController(AirdropService airdropService) {
        this.airdropService = airdropService;
    }

    @GetMapping
    public ResponseEntity<List<AirdropViewModel>> getAllAirdrops(){
        return ResponseEntity.ok(airdropService.getAllAirdrops());
    }
}
