package org.n11_bootcamp;

import org.n11_bootcamp.entities.House;
import org.n11_bootcamp.entities.Summerhouse;
import org.n11_bootcamp.entities.Villa;
import org.n11_bootcamp.service.Service;

public class Main {
    public static void main(String[] args) {
        Service s = new Service(Summerhouse.getSummerhouseList(), Villa.getVillaList(), House.getHouseList());


        System.out.println("Total price of houses: " + s.totalPrice(House.getHouseList()));
        System.out.println("Total price of villas: " + s.totalPrice(Villa.getVillaList()));
        System.out.println("Total price of summerhouses: " + s.totalPrice(Summerhouse.getSummerhouseList()));
        System.out.println("Total price of all types of houses: " + s.totalPriceOfAll());
        System.out.println("Average square meters of houses: " + s.averageSquareMeter(House.getHouseList()));
        System.out.println("Average square meter of villas: " + s.averageSquareMeter(Villa.getVillaList()));
        System.out.println("Average square meters of summerhouses: " + s.averageSquareMeter(Summerhouse.getSummerhouseList()));
        System.out.println("Average square meters of all types of houses: " + s.averageSquareMeterOfAll());
        s.filter(3, 1);
    }
}