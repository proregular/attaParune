package com.green.attaparune.restaurant.menu;

import com.green.attaparune.restaurant.menu.model.InsMenuReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestaurantMenuMapper {
    int insMenu(InsMenuReq p);
}
