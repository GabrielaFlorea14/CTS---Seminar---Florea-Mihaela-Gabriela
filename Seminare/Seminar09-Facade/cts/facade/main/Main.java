package cts.facade.main;

import cts.facade.RestaurantFacade;

public class Main {
	public static void main(String[] args) {
		RestaurantFacade restaurant = new RestaurantFacade();
		System.out.println(restaurant.verificareDisponibilitateMasa(3));
		System.out.println(restaurant.verificareDisponibilitateMasa(6));
		System.out.println(restaurant.verificareDisponibilitateMasa(1));

	}
}
