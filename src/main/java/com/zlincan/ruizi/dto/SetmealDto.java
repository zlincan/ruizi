package com.zlincan.ruizi.dto;

import com.zlincan.ruizi.entity.Setmeal;
import com.zlincan.ruizi.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
