package org.n11_bootcamp.entities;

public class House extends HouseTypes{
    public House(int price, int squareMeter, int roomCount, int livingRoomCount) {
        super(price, "House", squareMeter, roomCount, livingRoomCount);
    }
    public static HouseTypes[] getHouseList(){
        HouseTypes[] houseList = new House[3];
        houseList[0] = new House(2_000_000, 142, 4, 1);
        houseList[1] = new House(3_450_000, 123, 3, 1);
        houseList[2] = new House(5_000_000, 234, 5, 2);

        return houseList;
    }
}
