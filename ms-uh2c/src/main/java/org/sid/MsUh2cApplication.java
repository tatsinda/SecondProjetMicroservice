package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsUh2cApplication implements CommandLineRunner{

	@Autowired //on utilise l'injection des dependnces pour injecter une classe de cette interface
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	public static void main(String[] args) {
		SpringApplication.run(MsUh2cApplication.class, args);
	}

	//methode executee apres le demarrage de spirng
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Formation f1=formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2=formationRepository.save(new Formation(null,"Java",30,null));
		Formation f3=formationRepository.save(new Formation(null,"Oracle",30,null));

		//enregistrement des donnees dans la base de donnee
		etudiantRepository.save(new Etudiant(null,"blanc","leroy",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"majoie","tatsinda",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"marina","catherine",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"melchiade","ndongue",new Date(),f3));
		
		
		
	}

}
