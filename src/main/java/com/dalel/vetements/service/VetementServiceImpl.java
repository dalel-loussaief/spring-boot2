package com.dalel.vetements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.dalel.vetements.entities.Genres;
import com.dalel.vetements.entities.Vetement;
import com.dalel.vetements.repos.VetementRepository;
@Service
public class VetementServiceImpl implements VetementService {

	@Autowired
	VetementRepository vetementRepository;
	
	
	@Override
	public Vetement saveVetement(Vetement v) {
		
		return vetementRepository.save(v);
	}

	@Override
	public Vetement updateVetement(Vetement v) {
		
		return vetementRepository.save(v);
	}

	@Override
	public void deleteVetement(Vetement v) {
		 vetementRepository.delete(v);
		
	}

	@Override
	public void deleteVetementById(Long id) {
		vetementRepository.deleteById(id);
		
	}

	@Override
	public Vetement getVetement(Long id) {
		
		return vetementRepository.findById(id).get();
	}

	@Override
	public List<Vetement> getAllVetement() {
		
	 return vetementRepository.findAll();
	}

	@Override
	public Page<Vetement> getAllVetementParPage(int page, int size) {
		
		return  vetementRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Vetement> findBynomvetement(String nomvetement) {
		
		return vetementRepository.findBynomvetement(nomvetement);
	}

	@Override
	public List<Vetement> findBynomvetementContains(String nomvetement) {
		
		return vetementRepository.findBynomvetementContains(nomvetement);

	}

	@Override
	public List<Vetement> findByNomPrix(String nom, Double prix) {
		
		return vetementRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Vetement> findByGenres(Genres genres) {
		
		return vetementRepository.findByGenres(genres);
	}

	@Override
	public List<Vetement> findByGenresIdG(Long id) {
		
		return vetementRepository.findByGenresIdG(id);
	}

	@Override
	public List<Vetement> findByOrderByNomvetementAsc() {
		
		return vetementRepository.findByOrderByNomvetementAsc();
	}

	@Override
	public List<Vetement> trierVetementNomsPrix() {
		
		return vetementRepository.trierVetementNomsPrix();
	}
	
}
