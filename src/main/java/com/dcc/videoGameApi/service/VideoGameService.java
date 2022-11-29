package com.dcc.videoGameApi.service;

import com.dcc.videoGameApi.VideoGameApiApplication;
import com.dcc.videoGameApi.models.VideoGame;
import com.dcc.videoGameApi.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class VideoGameService {

    @Autowired
    private VideoGameRepository videoGameRepository;

    public long GetCountOfGames(){
        return videoGameRepository.count();
    }

    public List<VideoGame> GetAll() {
        List<VideoGame> result = videoGameRepository.findAll().stream().toList();
        return result;
    }

    public VideoGame getById(Integer id){
        VideoGame result = videoGameRepository.findAll().stream().filter(v->v.getId() == id).findFirst().orElse(null);
        return result;
    }

}
