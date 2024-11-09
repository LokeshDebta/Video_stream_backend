package com.stream.app.services;


import com.stream.app.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;

public interface VideoService {

    //save  video
    Video saveVideo(Video video, MultipartFile file);


    // get video by  id
    Video getById(String videoId);


    // get video by title

    Video getByTitle(String title);

    List<Video> getAllVideos();


    //video processing
    String processVideo(String videoId);


}
