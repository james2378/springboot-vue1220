package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghexinxiView;


/**
 * 综合信息
 *
 * @author 
 * @email 
 * @date 2023-03-25 15:35:13
 */
public interface ZonghexinxiService extends IService<ZonghexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghexinxiVO> selectListVO(Wrapper<ZonghexinxiEntity> wrapper);
   	
   	ZonghexinxiVO selectVO(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
   	
   	List<ZonghexinxiView> selectListView(Wrapper<ZonghexinxiEntity> wrapper);
   	
   	ZonghexinxiView selectView(@Param("ew") Wrapper<ZonghexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghexinxiEntity> wrapper);
   	

}

