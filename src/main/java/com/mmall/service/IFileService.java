package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by xiongpc on 2017/9/21.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
