package com.vita.web.services;

import com.vita.web.dto.ClubDto;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();
}
