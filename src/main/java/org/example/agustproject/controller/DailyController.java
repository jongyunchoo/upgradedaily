package org.example.agustproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.agustproject.dto.daily.*;
import org.example.agustproject.service.DailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DailyController {

    private final DailyService dailyService;

    @PostMapping("/dailies")
    public ResponseEntity<DailySaveResponseDto> saveDaily(@RequestBody DailySaveRequestDto dailySaverequestDto) {
        return ResponseEntity.ok(dailyService.saveDaily(dailySaverequestDto));
    }

    @GetMapping("/dailies")
    public ResponseEntity<List<DailySimpleResponseDto>> getDailies(){
        return ResponseEntity.ok(dailyService.getDailies());
    }

    @PutMapping("/daliies/{dailiesId}")
    public ResponseEntity<DailyUpdateResponseDto> updateDaily(@PathVariable Long dailiesId, @RequestBody DailyUpdateRequestDto dailyUpdateRequestDto){
        return ResponseEntity.ok(dailyService.updateDaily(dailiesId, dailyUpdateRequestDto));
    }
}
