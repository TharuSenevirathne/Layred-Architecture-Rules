public class Boy {
    Agrement agrement = new Girl(); //kelinma class eka athulata inject krl thinne.
    
    public static void main(String[] args) {
       Boy boy = new Boy();
       boy.chatWithGirl();
       boy.test();
    }

    private void test() {
        agrement.chat();
    }

    private void chatWithGirl() {
        agrement.chat();
    }
}
