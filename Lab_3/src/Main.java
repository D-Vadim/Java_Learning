public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Point2d myPoint = new Point2d(); // создает точку (0, 0)
        Point2d myOtherPoint = new Point2d(5,3); // создает точку (5, 3)
        Point2d aThirdPoint = new Point2d();

        Point3d my3DPoint = new Point3d(); // создает точку (0, 0, 0)
        Point3d myOther3DPoint = new Point3d(5, 3, 4); // создает точку (5, 3, 4)



        BMX bike1 = new BMX(2, 8);
        bike1.purpose();
        bike1.printInfo();

        bike1.setFrame(20);
        bike1.setDiameter(26);

        bike1.printInfo();

        MountainBike bike2 = new MountainBike();
        ChildrenBicycle bike3 = new ChildrenBicycle(10, 12, 2);
        ChildrenBicycle bike4 = new ChildrenBicycle();

        bike3.printInfo();
        bike4.printInfo();

        System.out.println("====================================================");

        System.out.println("Demonstration of work STATIC");
        System.out.println("bike1 ID --> " + bike1.getId());
        System.out.println("bike2 ID --> " + bike2.getId());
        System.out.println("bike3 ID --> " + bike3.getId());
        System.out.println("bike4 ID --> " + bike4.getId());


        //TwoWheeledChildrenBicycle bike5 = new TwoWheeledChildrenBicycle();
        //System.out.println("bike5 ID --> " + bike5.getId());



    }
}
