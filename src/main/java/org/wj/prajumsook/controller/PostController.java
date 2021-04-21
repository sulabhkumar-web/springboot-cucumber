package org.wj.prajumsook.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wj.prajumsook.entity.Post;

@RestController
@RequestMapping("/post")
public class PostController {

    //@Autowired
    //private PostService postService;

	
	static List<Post> list = new ArrayList<Post>();
    @GetMapping
    public List<Post> getAllPost() {
    	
    	return list;
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable(value = "id")String id) {
        return list.get(0);
    }

    @PostMapping
    public Post savePost(@RequestBody Post post) {
    	list.add(new Post("1", "Java", "web services"));
    	return list.get(0);
    }

    public List<Post> getAllPostFallback() {
        //return Collections.emptyList();
        return Arrays.asList(new Post("ID:123456", "Empty title", "Empty content"));
    }
}
