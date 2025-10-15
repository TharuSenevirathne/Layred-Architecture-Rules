public class Boy implements Interface{
    Agrement agrement;

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatWithGirl();
        boy.test();
    }

    private void test() {
        System.out.println("AB");
    }

    private void chatWithGirl() {
        System.out.println("CD");
    }

    //methana override wenw
    public void inject(Agrement agrement) {
        this.agrement = agrement;
    }
}
