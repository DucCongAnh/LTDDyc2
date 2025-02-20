package com.example.yc2.Repository;

import com.example.yc2.Model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findByCategoryId(Long categoryId);
    List<Story> findTop10ByOrderByViewsDesc();
    List<Story> findTop10ByCreatedAtAfterOrderByCreatedAtDesc(Date date);
}
