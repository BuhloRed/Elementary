package ua.hilel.hw2;

public class Main {

    static public PassengerElevator[] pass = new PassengerElevator[4];
    static public ServiceElevator[] serv = new ServiceElevator[4];
    static public DisabledElevator[] disable = new DisabledElevator[4];

    public static void main(String[] args) {

        pass[0] = new PassengerElevator(-3);
        pass[1] = new PassengerElevator(9999);
        pass[2] = new PassengerElevator(8);
        pass[3] = new PassengerElevator(1);

        for (int i = 0; i<4; i++){
            pass[i].showDataPassenger();
        }

        serv[0] = new ServiceElevator(-3);
        serv[1] = new ServiceElevator(9999);
        serv[2] = new ServiceElevator(8);
        serv[3] = new ServiceElevator(1);

        for (int i = 0; i<4; i++){
            serv[i].showDataService();
        }

        disable[0] = new DisabledElevator(-3);
        disable[1] = new DisabledElevator(9999);
        disable[2] = new DisabledElevator(8);
        disable[3] = new DisabledElevator(1);

        for (int i = 0; i<4; i++){
            disable[i].showDataDisabled();
        }
    }
}
