class GetSet {

    public static void main(String[] args){
        Circle C = new Circle(7);
        System.out.println(C.calArea());
        System.out.println(C.calParameter());
        System.out.println("radius is "+C.getR());
        C.setR(10); // Because of the access modifier being set to PRIVATE we have to use set to update the value. C.r = 10; if it was public
        System.out.println(C.calArea());
        System.out.println(C.calParameter());
        System.out.println("radius is "+C.getR());
    }
}


class Circle{
    private int r;
    private final float pi = 3.14f;

    public Circle(int r){

        this.r = r;
    }

    public void setR(int r) {
        this.r = r;  //since our data member 'r' is private the way to have access to it is through set
    }

    public int getR(){
        return this.r; //since our data member 'r' is private the way to have access to it is through get
    }
    public float calArea(){
        return (pi*r*r);
        }
    public float calParameter(){
        float p;
        p = 2*pi*r;
        return p;
    }
}


