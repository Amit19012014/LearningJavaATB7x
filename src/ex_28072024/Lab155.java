package ex_28072024;

public class Lab155 {
    public static void main(String[] args) {
        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();

    }
}

