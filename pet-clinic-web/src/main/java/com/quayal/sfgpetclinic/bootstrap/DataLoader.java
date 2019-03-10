package com.quayal.sfgpetclinic.bootstrap;

import com.quayal.sfgpetclinic.model.Owner;
import com.quayal.sfgpetclinic.model.Pet;
import com.quayal.sfgpetclinic.model.PetType;
import com.quayal.sfgpetclinic.model.Vet;
import com.quayal.sfgpetclinic.services.OwnerService;
import com.quayal.sfgpetclinic.services.PetTypeService;
import com.quayal.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");

		PetType savedDogType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");

		PetType savedCatType = petTypeService.save(cat);

		Owner mike = new Owner();
		mike.setFirstName("Michael");
		mike.setLastName("Weston");
		mike.setAddress("123 Bickerel");
		mike.setCity("Miami");
		mike.setTelephone("12345678");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogType);
		mikesPet.setOwner(mike);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Laika");
		mike.getPets().add(mikesPet);


		ownerService.save(mike);

		Owner fiona = new Owner();
		fiona.setFirstName("Fionna");
		fiona.setLastName("Glenanne");
		fiona.setAddress("123 Bickerel");
		fiona.setCity("Miami");
		fiona.setTelephone("12345678");

		Pet fionnasPet = new Pet();
		fionnasPet.setPetType(savedCatType);
		fionnasPet.setOwner(fiona);

		ownerService.save(fiona);

		System.out.println("Loaded owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");

		vetService.save(vet2);

		System.out.println("Loaded vets...");
	}
}
