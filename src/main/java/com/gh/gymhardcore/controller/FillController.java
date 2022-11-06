package com.gh.gymhardcore.controller;


import com.gh.gymhardcore.configuration.LoadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FillController {

    private final LoadData loadData;

    @Autowired
    public FillController(LoadData loadData) {
        this.loadData = loadData;
    }

    @PostMapping("/switch")
    public ResponseEntity<?> switcher() {
        return ResponseEntity.ok("Data added");
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteFillData() {
        loadData.deleteFillData();
        return ResponseEntity.ok("Fill deleted");
    }

}
