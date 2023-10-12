package com.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojosninjas.models.Ninja;
import com.dojosninjas.repositories.NinjaRepository;



@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepository;
	
	public List<Ninja> getAll()
	{
		return ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja l)
	{
		return ninjaRepository.save(l);
	}
	
	public Ninja findOne(Long id)
	{
		Optional<Ninja> OptLooky= ninjaRepository.findById(id);
		if(OptLooky.isPresent())
		{
		return OptLooky.get();
		}
		else return null;
	}
	
	public Ninja updateNinja(Ninja l)
	{
		
		return ninjaRepository.save(l);
	}
	
	public void deleteNinja(Long id)
	{
		ninjaRepository.deleteById(id);
	}
	
	
}
