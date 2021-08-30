package com.spring_rest_Q3;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	List<Address> list= Arrays.asList(
			new Address("Hyderabad", "Telangana", "India", 50028),
			new Address("Mexican", "New York", "USA", 56776),
			new Address("Vancouver", "Colombia", "Canada", 32001)
			);
	
	@RequestMapping("/address/{zip}")
	public Address dsiplayAddress(@PathVariable("zip") int zip) {
		for(Address add: list) {
			if(add.getZipcode()==zip) {
				return add;
			}
		}
		return null;
	}
}