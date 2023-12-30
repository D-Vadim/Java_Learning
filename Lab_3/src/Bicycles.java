public abstract class Bicycles {
    private float frame;
    private float diameter;
    private int maxRiderWeight, price;
    private int id;
    static int counter = 1;

    Bicycles(float frame, float diameter) {
        this.frame = frame;
        this.diameter = diameter;
        this.id = counter;
        counter += 1;
    }

    public float getFrame() {
        return this.frame;
    }
    public float getDiameter() {
        return this.diameter;
    }

    public int getId() {
        return this.id;
    }

    public void setFrame(float frame) {
        this.frame = frame;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public void printInfo() {
        System.out.println("====================================================\n");
        System.out.println("Information for bike with index " + this.getId());
        System.out.println("This is a Bicycle for adults with 2 wheels");
        System.out.println("Frame size = " + this.getFrame() + " inches" );
        System.out.println("Wheel diameter = " + this.getDiameter() +" inches");
        System.out.println("\n====================================================");
    }

    public abstract void purpose();
}


class BMX extends Bicycles {
    private String model;

    BMX(float f, float d){
        super(f, d);
        System.out.println("Create a BMX Bicycle");
    }

    BMX() {
        super(18,20);
        System.out.println("Create a BMX Bicycle");
    }

    public void purpose() {
        System.out.println("BMX designed for extreme riding");
    }
}

class MountainBike extends Bicycles {
    private String model;

    MountainBike(float f, float d){
        super(f, d);
        System.out.println("Create a Mountain Bicycle");
    }

    MountainBike() {
        super(20, 26);
        System.out.println("Create a Mountain Bicycle");
    }

    public void purpose() {
        System.out.println("Mountain Bike designed for off-road driving");
    }
}

class ChildrenBicycle extends Bicycles {
    private final int countWheel;
    private String model;
    ChildrenBicycle(float f, float d, int count){
        super(f, d);
        this.countWheel = count;
        System.out.println("Create a Children Bicycle");
    }

    ChildrenBicycle() {
        super(12, 14);
        this.countWheel = 3;
        System.out.println("Create a Children Bicycle");
    }

    public void purpose() {
        System.out.println("Children Bike designed for children");
    }

    @Override
    public void printInfo() {
        System.out.println("====================================================\n");
        System.out.println("Information for bike with index " + this.getId());
        System.out.println("This is a Children bicycle with " + countWheel + " wheels");
        System.out.println("Frame size = " + this.getFrame() + " inches" );
        System.out.println("Wheel diameter = " + this.getDiameter() +" inches");
        System.out.println("\n====================================================");
    }

    public int getCountWheel() {
        return this.countWheel;
    }
}
