package com.example.gesipan.board;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    List<Board> getAllBoard();

}
