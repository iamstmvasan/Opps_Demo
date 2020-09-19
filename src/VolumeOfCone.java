public class VolumeOfCone extends VolumeOfCylinder {
    // pi * r*r*h /3
    VolumeOfCone(){
        System.out.println("Volume of cone object is created !");
    }
    float volumeofCone;
    void input(){
        super.input();
    }
    void process(){
        super.process();
        volumeofCone = volumeOfCylinder / 3;
    }
    void output(){
        System.out.println("Volume of Cone is : "+volumeofCone);
    }
}
