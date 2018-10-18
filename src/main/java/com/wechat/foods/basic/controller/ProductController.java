package com.wechat.foods.basic.controller;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.wechat.foods.basic.VO.CategoryTypeVO;
import com.wechat.foods.basic.VO.ProductInfoVO;
import com.wechat.foods.basic.VO.Result;
import com.wechat.foods.basic.dataobject.Category;
import com.wechat.foods.basic.dataobject.ProductInfo;
import com.wechat.foods.basic.enums.CategoryType;
import com.wechat.foods.basic.service.CategoryService;
import com.wechat.foods.basic.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 @classname:ProductController
 @AUTHOR:ZSN
 @DATE:2018/10/191:30
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping
    @ResponseBody
    private Result ToWechatFirst(){
        List<CategoryTypeVO> lists=new ArrayList<>();
        List<Category> categories=categoryService.getProductByCategoryType(Arrays.asList(0,1));
        for (int i=0;i<categories.size();i++){
            CategoryTypeVO categoryTypeVO=new CategoryTypeVO();
            List<ProductInfo> productInfos=productInfoService.getProductByCategoryType(Arrays.asList(i));
            categoryTypeVO.setCategoryName(categories.get(i).getCategoryName());
            categoryTypeVO.setCategoryType(categories.get(i).getCategoryType());
            List<ProductInfoVO> productInfoVOS=new ArrayList<>();
            for (int j=0;j<productInfos.size();j++){
                ProductInfoVO productInfoVO=new ProductInfoVO();
                BeanUtils.copyProperties(productInfos.get(j),productInfoVO);
                productInfoVOS.add(productInfoVO);
            }
            categoryTypeVO.setFoods(productInfoVOS);
            lists.add(categoryTypeVO);
        }
        Result result=new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setCategoryTypeVOS(lists);
        return result;
    }
    @RequestMapping("hot")
    @ResponseBody
    private List<ProductInfo> getHot(){
        List<Integer> list=new ArrayList<>();
        list.add(CategoryType.Up.getCode());
        return productInfoService.getProductByCategoryType(list);
    }

}
