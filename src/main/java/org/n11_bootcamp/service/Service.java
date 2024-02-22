package org.n11_bootcamp.service;

import org.n11_bootcamp.entities.HouseTypes;


public class Service {
    private HouseTypes[] summerhouseList;
    private HouseTypes[] villaList;
    private HouseTypes[] houseList;

    public Service(HouseTypes[] summerhouseList, HouseTypes[] villaList, HouseTypes[] houseList) {
        this.summerhouseList = summerhouseList;
        this.villaList = villaList;
        this.houseList = houseList;
    }


    public int totalPrice(HouseTypes[] houseTypes) {
        int totalPrice = 0;
        for (HouseTypes h : houseTypes) {
            totalPrice += h.getPrice();
        }

        return totalPrice;
    }


    public int totalPriceOfAll() {
        int totalPriceOfAll = 0;
        totalPriceOfAll = totalPrice(summerhouseList) + totalPrice(houseList) + totalPrice(villaList);
        return totalPriceOfAll;
    }


    public int averageSquareMeter(HouseTypes[] houseTypes) {
        int average = 0;
        for (HouseTypes h : houseTypes) {
            average += h.getSquareMeter();
        }
        average = average / houseTypes.length;
        return average;
    }


    public int averageSquareMeterOfAll() {
        int averageSquareMeterOfAll = 0;
        averageSquareMeterOfAll = (averageSquareMeter(villaList) + averageSquareMeter(houseList) + averageSquareMeter(summerhouseList)) / 3;
        return averageSquareMeterOfAll;
    }


    public void filter(int room, int livingRoom) {
        int summerhouseCounter = 0;
        int villaCounter = 0;
        int houseCounter = 0;
        for (HouseTypes y : summerhouseList) {
            if (room == y.getRoomCount() && livingRoom == y.getLivingRoomCount()) {
                summerhouseCounter++;
            }
        }
        for (HouseTypes e : houseList) {
            if (room == e.getRoomCount() && livingRoom == e.getLivingRoomCount()) {
                houseCounter++;
            }
        }
        for (HouseTypes v : villaList) {
            if (room == v.getRoomCount() && livingRoom == v.getLivingRoomCount()) {
                villaCounter++;
            }
        }
        System.out.println("There are " + houseCounter + " house, " + villaCounter + " villa and " + summerhouseCounter + " summerhouse according to the criteria you are looking for.");
    }
}
