package org.example.agustproject.service;

import lombok.RequiredArgsConstructor;
import org.example.agustproject.dto.comment.*;
import org.example.agustproject.entity.CommentEntity;
import org.example.agustproject.entity.DailyEntity;
import org.example.agustproject.repository.CommentRepository;
import org.example.agustproject.repository.DailyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {

    private final DailyRepository dailyRepository;
    private final CommentRepository commentRepository;

    @Transactional
    public CommentSaveResponseDto saveComment(Long dailyId,CommentSaveRequestDto commentSaveRequestDto) {

        DailyEntity daily = dailyRepository.findById(dailyId).orElseThrow(()-> new NullPointerException("일정이 없습니다."));

        CommentEntity newComment = new CommentEntity(commentSaveRequestDto.getDetail(), daily);
        CommentEntity savedComment = commentRepository.save(newComment);

        return new CommentSaveResponseDto(savedComment.getId(), savedComment.getDetail(), savedComment.getCreatedAt(),savedComment.getModifiedAt());
    }


    public List<CommentSimpleResponseDto> getComments() {
        List<CommentEntity> commentList = commentRepository.findAll();

        List<CommentSimpleResponseDto> dtoList = new ArrayList<>();
        for(CommentEntity comment : commentList) {
            CommentSimpleResponseDto dto =new CommentSimpleResponseDto(comment.getDetail());
            dtoList.add(dto);
        }

        return dtoList;
    }


    public CommentDetailResponseDto getComment(Long commentId) {
        CommentEntity comment = commentRepository.findById(commentId).orElseThrow(() -> new NullPointerException ("댓글이 없습니다."));

        return new CommentDetailResponseDto(comment.getId(),comment.getDetail(),comment.getCreatedAt(),comment.getModifiedAt());

    }
    @Transactional
    public CommentUpdateResponseDto updateComment(Long commentId, CommentUpdateRequestDto commentUpdateRequestDto) {
        CommentEntity comment = commentRepository.findById(commentId).orElseThrow(() -> new NullPointerException ("댓글이 없습니다."));

        comment.update(commentUpdateRequestDto.getDetail());

        return new CommentUpdateResponseDto(comment.getId(),comment.getDetail(),comment.getCreatedAt(),comment.getModifiedAt());
    }

    @Transactional
    public void deleteComment(Long commentId) {
        CommentEntity comment = commentRepository.findById(commentId).orElseThrow(() -> new NullPointerException("댓글이 없습니다."));

        commentRepository.delete(comment);
    }

}
