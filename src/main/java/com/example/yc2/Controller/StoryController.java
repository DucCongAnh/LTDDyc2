package com.example.yc2.controller;

import com.example.yc2.Model.Story;
import com.example.yc2.Service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stories")
public class StoryController {

    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping("/category/{categoryId}")
    public List<Story> getStoriesByCategory(@PathVariable Long categoryId) {
        return storyService.getStoriesByCategory(categoryId);
    }

    @GetMapping("/top-viewed")
    public List<Story> getTopViewedStories() {
        return storyService.getTopViewedStories();
    }

    @GetMapping("/recent")
    public List<Story> getRecentStories() {
        return storyService.getRecentStories();
    }
}
