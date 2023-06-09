package com.vita.web.services.impl;

import com.vita.web.dto.ClubDto;
import com.vita.web.models.Club;
import com.vita.web.repository.ClubRepository;
import com.vita.web.services.ClubService;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        //return the clubs as DTOs
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    //MAPPER
    private ClubDto mapToClubDto(Club club){
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }
}
