package com.bis.eps.offerprocessing.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.bis.eps.common.dao.JpaDao;
import com.bis.eps.offerprocessing.entity.Marketer;


@Repository("marketerDao")
@Transactional
public class MarketerDaoImpl extends JpaDao<Marketer, Long> implements MarketerDao{

	Logger  LOG = Logger.getLogger(MarketerDaoImpl.class.getName());
	public MarketerDaoImpl()
	{
		super(Marketer.class);
	}
}
