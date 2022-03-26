public interface Animal {
    public void sound();
    public void eat();

}class Child implements Animal{

    @Override
    public void sound() {
        System.out.println("23");
    }

    @Override
    public void eat() {
        System.out.println("drinking");

    }
}class test{
    public static void main(String[] args) {
        Child child =new Child();
        child.sound();
        child.eat();

    }
}
