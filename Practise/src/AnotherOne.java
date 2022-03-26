interface AnotherOne {
    void eat();
    void sleep();

}interface One extends AnotherOne{
    void main();
    int age = 10;

} class Dog implements One,AnotherOne{
   public void eat(){

    }

    @Override
    public void sleep() {

    }

    @Override
    public void main() {

    }

    public static void main(String[] args) {

    }
}
