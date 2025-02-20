package com.example.yc2.Service;

import com.example.yc2.Model.Story;
import com.example.yc2.Repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class StoryService {
    @Autowired
    private StoryRepository storyRepository;

    public List<Story> getStoriesByCategory(Long categoryId) {
        return storyRepository.findByCategoryId(categoryId);
    }

    public List<Story> getTopViewedStories() {
        return storyRepository.findTop10ByOrderByViewsDesc();
    }

    public List<Story> getRecentStories() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -7);
        Date sevenDaysAgo = calendar.getTime();
        return storyRepository.findTop10ByCreatedAtAfterOrderByCreatedAtDesc(sevenDaysAgo);
    }
}
