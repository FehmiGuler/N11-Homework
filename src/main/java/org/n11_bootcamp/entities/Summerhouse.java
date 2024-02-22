package org.n11_bootcamp.entities;

public class Summerhouse extends HouseTypes {

    public Summerhouse(int price, int squareMeter, int roomCount, int livingRoomCount) {
        super(price, "Summerhouse", squareMeter, roomCount, livingRoomCount);
    }
    public static HouseTypes[] getSummerhouseList() {
        HouseTypes[] summerhouseList = new Summerhouse[3];
        summerhouseList[0] = new Summerhouse(1_000_000, 140, 4, 1);
        summerhouseList[1] = new Summerhouse(1_450_000, 120, 3, 1);
        summerhouseList[2] = new Summerhouse(3_000_000, 200, 5, 2);

        return summerhouseList;
    }
}
