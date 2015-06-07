package pl.pjatk.tpc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.pjatk.tpc.entity.Stopa;

public interface StopaRepository extends JpaRepository<Stopa, Integer> {
	
	
}
