package cts.proxy.main;

import cts.proxy.clase.IRestaurant;
import cts.proxy.clase.ProxyRestaurant;
import cts.proxy.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		IRestaurant restaurant = new Restaurant("Mamaia");
		restaurant.rezervaMasa(2);
		
		IRestaurant proxy = new ProxyRestaurant(restaurant);
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(6);
		proxy.rezervaMasa(5);

	}

}
