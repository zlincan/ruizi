package com.zlincan.ruizi.dto;

import com.zlincan.ruizi.entity.Dish;
import com.zlincan.ruizi.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
