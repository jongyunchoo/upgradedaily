package org.example.agustproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.agustproject.dto.comment.*;
import org.example.agustproject.entity.CommentEntity;
import org.example.agustproject.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comments")
    public ResponseEntity<CommentSaveResponseDto> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto) {
        return ResponseEntity.ok(commentService.saveComment(commentSaveRequestDto));
    }
    @GetMapping("/comments")
    public ResponseEntity<List<CommentSimpleResponseDto>> getComment(){
        return ResponseEntity.ok(commentService.getComments());
    }
    @GetMapping("/comments/{commentsId}")
    public ResponseEntity<CommentDetailResponseDto> getComment(@PathVariable Long commentsId) {
        return ResponseEntity.ok(commentService.getComment(commentsId));
    }

    @PutMapping("/comments/{commentsId}")
    public ResponseEntity<CommentUpdateResponseDto> updateComment(@PathVariable Long commentId, @RequestBody CommentUpdateRequestDto commentUpdateRequestDto) {
        return ResponseEntity.ok(commentService.updateComment(commentId, commentUpdateRequestDto));
    }

    @DeleteMapping("/comments/{commentsId}")
    public void deleteComment(@PathVariable Long commentsId) {
        commentService.deleteComment(commentsId);
    }
}
