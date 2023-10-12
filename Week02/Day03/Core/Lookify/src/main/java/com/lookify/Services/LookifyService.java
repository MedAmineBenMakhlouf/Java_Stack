package com.lookify.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookify.Repositories.LookifyRepository;
import com.lookify.models.Lookify;

@Service
public class LookifyService {
	@Autowired
	private LookifyRepository lookifyRepository;
	
	public List<Lookify> getAll()
	{
		return lookifyRepository.findAll();
	}
	
	public Lookify createLookify(Lookify l)
	{
		return lookifyRepository.save(l);
	}
	
	public Lookify findOne(Long id)
	{
		Optional<Lookify> OptLooky= lookifyRepository.findById(id);
		if(OptLooky.isPresent())
		{
		return OptLooky.get();
		}
		else return null;
	}
	
	public Lookify updateLookify(Lookify l)
	{
		return lookifyRepository.save(l);
	}
	
	public void deleteLookify(Long id)
	{
		lookifyRepository.deleteById(id);
	}
	
	public List<Lookify> getTop10()
	{
		return lookifyRepository.findTop10ByOrderByRatingDesc();
	}
	
	public List<Lookify> findByName(String name)
	{
		return lookifyRepository.findByArtist(name);
	}
	
}
