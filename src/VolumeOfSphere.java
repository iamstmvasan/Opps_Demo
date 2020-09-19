public class VolumeOfSphere extends AreaOfCircle {
    // 4/3 * pi * r * r * r
    float volumeOfSphere;
    // int a = 10; a = 50; print(a)
    void sample(){
        System.out.println("Sample method from Sphere class !");
    }
    void input(){
        super.input();
    }
    void process(){
        super.process();
        volumeOfSphere = areaOfCircle * radius * 4 / 3;
    }
    void output(){
        System.out.println("Volume of Sphere is : "+volumeOfSphere);
    }

}
