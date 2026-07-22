package com.mobile.springbootjwtapi.services;

import com.mobile.springbootjwtapi.models.FileImageDetail;
import com.mobile.springbootjwtapi.models.res.UploadImageRes;
import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    UploadImageRes uploadFile(MultipartFile files);

    FileImageDetail findImageByFileName(String fileName);
}
