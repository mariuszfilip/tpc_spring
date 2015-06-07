package pl.pjatk.tpc.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.pjatk.tpc.entity.Stopa;
import pl.pjatk.tpc.repository.StopaRepository;


@Service
public class UpdateStopa {
	
	@Autowired
	private StopaRepository stopaRepository;
	
	@Autowired
	private ReadXml readXml;
	
	@PostConstruct
	public void update(){
		
		Stopa stopaDane = readXml.read();
		if(stopaDane instanceof Stopa){
			stopaRepository.save(stopaDane);
		}
	
	}

}
