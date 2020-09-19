public class VolumeOfCylinder extends AreaOfCircle{
    VolumeOfCylinder(){
        System.out.println("Volume of cylinder object is created !");
    }
    // Volume of Cylinder = pi * r * r * h
    // Volume of Cylinder is a Area Of Circle
    float height, volumeOfCylinder;
    void input(){
        super.input();
        System.out.println("Enter Height : ");
        height = sc.nextFloat();
    }
    void process(){
        super.process();
        volumeOfCylinder = areaOfCircle * height;
    }
    void output(){
        System.out.println("Volume of Cylinder is : "+volumeOfCylinder);
    }
}
