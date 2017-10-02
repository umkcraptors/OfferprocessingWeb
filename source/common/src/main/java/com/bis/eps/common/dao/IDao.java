package com.bis.eps.common.dao;

import java.util.List;

import com.bis.eps.common.entity.IEntity;

public interface IDao<T extends IEntity, I> {

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}
