package com.how2java.tmall.controller;

import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PropertyController {
    @Autowired
    PropertyService propertyServise;
    @Autowired
    CategoryService categoryService;

}
