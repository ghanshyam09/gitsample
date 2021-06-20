
interface ParkingLot {

	void parkCar();	// Decrease empty spot count by 1
	void unparkCar(); // Increase empty spots by 1
	void getCapacity();	// Returns car capacity
	double calculateFee(Car car); // Returns the price based on number of hours
	void doPayment(Car car);
}
/*so here the class which implements above interface has to force fully give definition for these
 methods dosen't matter it is imp or not**/
// so we will split it into multiple interfaces
 
interface Parking {
    void parkCar(); // Decrease empty spot count by 1

    void unparkCar(); // Increase empty spots by 1

    void getCapacity();
}

interface fees {
    double freeparking();
}

interface doPayment extends Parking{
    void payment();
}
class Car implements fees{
    public double freeparking() {
        ///so this car is not
        return 0;
    }
}


public class Interf {
    
}
