package com.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {

	
	@Autowired
	private DojoRepository dojoRepository;
	
	public List<Dojo> getAll()
	{
		return dojoRepository.findAll();
	}
	
	public Dojo createDojo(Dojo l)
	{
		return dojoRepository.save(l);
	}
	
	public Dojo findOne(Long id)
	{
		Optional<Dojo> OptDojo= dojoRepository.findById(id);
		if(OptDojo.isPresent())
		{
		return OptDojo.get();
		}
		else return null;
	}
	
	public Dojo updateDojo(Dojo l)
	{
		return dojoRepository.save(l);
	}
	
	public void deleteDojo(Long id)
	{
		dojoRepository.deleteById(id);
	}
}
