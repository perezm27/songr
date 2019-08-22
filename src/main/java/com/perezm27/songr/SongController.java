package com.perezm27.songr;

import com.perezm27.songr.models.Album;
import com.perezm27.songr.models.AlbumRepository;
import com.perezm27.songr.models.Song;
import com.perezm27.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getSongs(Model m){
//        Song s = songRepository.findById(id).get();
        List<Song> s = songRepository.findAll();
        m.addAttribute("songs", s);
        return "addSongs";
    }
    @PostMapping("/songs")
    public RedirectView addSongs(String title, long length, int trackNumber, String album) {
        Album a = albumRepository.findByTitle(album);
        Song s = songRepository.findByTitle(title);

        if (s == null) {
            s = new Song(title, length, trackNumber, a);
            songRepository.save(s);
        }
        return new RedirectView("/songs");
    }

}