package org.example.agustproject.service;

import lombok.RequiredArgsConstructor;
import org.example.agustproject.dto.daily.*;
import org.example.agustproject.repository.DailyRepository;
import org.example.agustproject.entity.DailyEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DailyService {

    private final DailyRepository dailyRepository;

    @Transactional
    public DailySaveResponseDto saveDaily(DailySaveRequestDto dailySaveRequestDto) {
        DailyEntity newdaily = new DailyEntity(
                dailySaveRequestDto.getId(),
                dailySaveRequestDto.getDailytitle(),
                dailySaveRequestDto.getDailydetail()
        );

        DailyEntity savedDaily = dailyRepository.save(newdaily);

        return new DailySaveResponseDto(
                savedDaily.getId(),
                savedDaily.getDailytitle(),
                savedDaily.getDailydetail(),
                savedDaily.getCreatedAt(),
                savedDaily.getModifiedAt()
        );
    }

    public List<DailySimpleResponseDto> getDailies() {
        List<DailyEntity> dailyList = dailyRepository.findAll();

        List<DailySimpleResponseDto> dtoList = new ArrayList<>();
        for(DailyEntity daily : dailyList){
            DailySimpleResponseDto dto = new DailySimpleResponseDto(
                    daily.getId(),
                    daily.getDailytitle(),
                    daily.getDailydetail(),
                    daily.getCreatedAt(),
                    daily.getModifiedAt()
            );
            dtoList.add(dto);
        }
        return dtoList;
    }
    @Transactional
    public DailyUpdateResponseDto updateDaily(Long dailyId, DailyUpdateRequestDto dailyUpdateRequestDto) {
        DailyEntity daily = dailyRepository.findById(dailyId).orElseThrow(()-> new NullPointerException("일정은 없습니다."));

        daily.updateDaily(
                dailyUpdateRequestDto.getDailytitle(),
                dailyUpdateRequestDto.getDailydetail()
        );

        return new DailyUpdateResponseDto(daily.getId(), daily.getDailytitle(), daily.getDailydetail());
    }
}
