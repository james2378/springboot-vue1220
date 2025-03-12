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


import com.dao.XueshengjiaofeiDao;
import com.entity.XueshengjiaofeiEntity;
import com.service.XueshengjiaofeiService;
import com.entity.vo.XueshengjiaofeiVO;
import com.entity.view.XueshengjiaofeiView;

@Service("xueshengjiaofeiService")
public class XueshengjiaofeiServiceImpl extends ServiceImpl<XueshengjiaofeiDao, XueshengjiaofeiEntity> implements XueshengjiaofeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjiaofeiEntity> page = this.selectPage(
                new Query<XueshengjiaofeiEntity>(params).getPage(),
                new EntityWrapper<XueshengjiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjiaofeiEntity> wrapper) {
		  Page<XueshengjiaofeiView> page =new Query<XueshengjiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjiaofeiVO> selectListVO(Wrapper<XueshengjiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjiaofeiVO selectVO(Wrapper<XueshengjiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjiaofeiView> selectListView(Wrapper<XueshengjiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjiaofeiView selectView(Wrapper<XueshengjiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
