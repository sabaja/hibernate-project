package com.hibernate.dao;

import java.util.List;

import com.hibernate.domain.Payload;



public interface PayloadDao {
	
	public Long save(Payload payload);
	public void updatePayload(Payload payload);
	public List<Payload> listPayloads();
	public List<Payload> listPayloadsWithCriteria();
	public void removePaylod(Long id);

}
