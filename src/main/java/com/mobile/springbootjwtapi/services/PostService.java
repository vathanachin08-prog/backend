package com.mobile.springbootjwtapi.services;

import com.mobile.springbootjwtapi.exception.AppException;
import com.mobile.springbootjwtapi.models.Post;
import com.mobile.springbootjwtapi.models.req.PostCreateReq;
import com.mobile.springbootjwtapi.models.req.PostUpdateReq;
import com.mobile.springbootjwtapi.models.res.PageRes;

public interface PostService {

    PageRes<Post> findAll(int page, int size, String status, Integer categoryId, Integer userId, String keyword) throws AppException;

    Post findById(Integer id) throws AppException;

    Post create(PostCreateReq req) throws AppException;

    Post update(Integer id, PostUpdateReq req) throws AppException;

    void delete(Integer id) throws AppException;

    Post like(Integer id) throws AppException;

    Post dislike(Integer id) throws AppException;
}