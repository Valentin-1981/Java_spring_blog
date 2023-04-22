package com.gb.blog3.repo;

import com.gb.blog3.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
