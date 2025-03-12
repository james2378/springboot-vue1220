package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZonghexinxiDao;
import com.entity.ZonghexinxiEntity;
import com.service.ZonghexinxiService;
import com.entity.vo.ZonghexinxiVO;
import com.entity.view.ZonghexinxiView;

@Service("zonghexinxiService")
public class ZonghexinxiServiceImpl extends ServiceImpl<ZonghexinxiDao, ZonghexinxiEntity> implements ZonghexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghexinxiEntity> page = this.selectPage(
                new Query<ZonghexinxiEntity>(params).getPage(),
                new EntityWrapper<ZonghexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghexinxiEntity> wrapper) {
		  Page<ZonghexinxiView> page =new Query<ZonghexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghexinxiVO> selectListVO(Wrapper<ZonghexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghexinxiVO selectVO(Wrapper<ZonghexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghexinxiView> selectListView(Wrapper<ZonghexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghexinxiView selectView(Wrapper<ZonghexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
