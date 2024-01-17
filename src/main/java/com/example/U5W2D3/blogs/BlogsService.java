package com.example.U5W2D3.blogs;

import com.example.U5W2D3.exceptions.NotFoundException;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Service
public class BlogsService {
    private List<Blog> blogs = new ArrayList<>();

    public Blog save(Blog body){
        Random rnd = new Random();
        body.setId(rnd.nextInt(1,3000));
        body.setReadingTime(rnd.nextInt(1,10));
        this.blogs.add(body);
        return body;
    }

    public Blog findById(int id) {
        Blog found = null;
        for (int i = 0; i < blogs.size(); i++) {
            if(blogs.get(i).getId() == id) {
                found = blogs.get(i);
            }
        }
        if(found == null) throw new NotFoundException(id);
        return found;
    }

    public Blog findByIdAndUpdate(int id, Blog body) {
        Blog found = null;
        for (int i = 0; i < blogs.size(); i++) {
            if (blogs.get(i).getId() == id) {
                found = blogs.get(i);
                found.setCategory(body.getCategory());
                found.setTitle(body.getTitle());
                found.setContent(body.getContent());
                found.setReadingTime(body.getReadingTime());
            }
        }
        if (found == null) throw new NotFoundException(id);
        return found;
    }

    public void findByIdAndDelete(int id) {
        Blog found = this.findById(id);
        for (int i = 0; i < blogs.size(); i++) {
            if(blogs.get(i).getId() == found.getId()) {
                    blogs.remove(found);
            }
        }
    }
}
