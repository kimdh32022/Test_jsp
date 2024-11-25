package com.busanit501.helloworld.Blog.Service;

import com.busanit501.helloworld.Blog.DTO.BlogDTO;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public enum BlogService {
    INSTANCE;

    public void register(BlogDTO blogDTO) {
        System.out.println("글쓰는 작업 중");
    }
    public List<BlogDTO> getList() {
        // 디비에서 데이터 조회 후, 전달하기
        List<BlogDTO> list = IntStream.range(0, 10)
                .mapToObj(i -> {
                    BlogDTO blogDTO = new BlogDTO();
//                    blogDTO.setUsername("글쓴이" + i);
                    blogDTO.setTitle("제목" + i);
                    blogDTO.setContent("내용" + i);
                    blogDTO.setBno(i);
                    return blogDTO;
                }).collect(Collectors.toList()); //10개의 인스턴스를 만듬.


        return list;
    }
//하나 조회 메소드
    public BlogDTO getOne(long i) {
        BlogDTO blogDTO = new BlogDTO();
//        blogDTO.setUsername("도현");
        blogDTO.setTitle("내가 좋아하는 글");
        blogDTO.setContent("셜록홈즈 소설집");
        blogDTO.setBno(5);
        return blogDTO;
    }
}
