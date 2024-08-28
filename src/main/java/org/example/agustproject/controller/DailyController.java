package org.example.agustproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.agustproject.dto.daily.*;
import org.example.agustproject.service.DailyService;
import org.springframework.data.domain.Page;
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
    public ResponseEntity<Page<DailySimpleResponseDto>> getDailies(
            @RequestParam(defaultValue = "1", required = false) int page,
            @RequestParam(defaultValue = "10", required = false) int size
    ){
        return ResponseEntity.ok(dailyService.getDailies(page, size));
    }

    @PutMapping("/daliies/{dailiesId}")
    public ResponseEntity<DailyUpdateResponseDto> updateDaily(@PathVariable Long dailiesId, @RequestBody DailyUpdateRequestDto dailyUpdateRequestDto){
        return ResponseEntity.ok(dailyService.updateDaily(dailiesId, dailyUpdateRequestDto));
    }
}
