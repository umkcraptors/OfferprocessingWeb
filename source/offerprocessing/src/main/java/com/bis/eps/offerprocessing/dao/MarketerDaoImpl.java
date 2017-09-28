package com.bis.eps.offerprocessing.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.common.dao.JpaDao;
import com.bis.eps.offerprocessing.entity.Marketer;

@Repository("marketerDao")
@Transactional
public class MarketerDaoImpl extends JpaDao<Marketer, Long> implements MarketerDao{

	public MarketerDaoImpl()
	{
		super(Marketer.class);
	}
}
