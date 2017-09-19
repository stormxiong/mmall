package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by xiongpc on 2017/9/20.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategory(Integer categoryId, String categoryName);
}
