package pl.pjatk.tpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.pjatk.tpc.repository.StopaRepository;
import pl.pjatk.tpc.entity.Stopa;

@Service
public class StopaService {
		
	@Autowired
	private StopaRepository stopaRep ;
	
	
	public List<Stopa> findAll(){
		return stopaRep.findAll();
	}
}
