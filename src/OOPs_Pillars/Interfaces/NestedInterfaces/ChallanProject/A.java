package OOPs_Pillars.Interfaces.NestedInterfaces.ChallanProject;

class A implements Challan.Carspeed{
    @Override
    public void vehicleSpeed(int speed) {
        if (speed > 120) {
            System.out.println("Challan deducted of Rs 2000 !");
        }
        else {
            System.out.println("Go to go fellow !");
        }
    }
}
