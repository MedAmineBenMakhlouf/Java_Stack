package com.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savetravels.models.Travel;
import com.savetravels.repositories.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelRepository travelRepository;
	
	public List<Travel> findAll()
	{
		return travelRepository.findAll();
	}
	
	public Travel createTravel(Travel t)
	{
		return travelRepository.save(t);
	}
	
	public Travel findOne(Long id)
	{
		Optional<Travel> OptTravel = travelRepository.findById(id);
		if(OptTravel.isPresent())
		{
		return OptTravel.get();
		}
		else return null;
	}
	
	public Travel updateTravel(Travel t)
	{
		return travelRepository.save(t);
	}
	
	public void deleteTravel(Long id)
	{
		travelRepository.deleteById(id);
	}
	
	
}
