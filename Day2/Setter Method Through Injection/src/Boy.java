public class Boy {
    Agrement agrement;

    public void setInjection(Agrement agrement) {
        this.agrement = agrement;
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setInjection(new Girl());/*setInjection method eka call krn welawe new Girl()
        object eka hadila setInjection method ekt parameters widita dependency eka inject krnw.*/
        boy.chatWithGirl();
        boy.test();
    }

    private void test() {
        System.out.println("AB");
    }

    private void chatWithGirl() {
        System.out.println("CD");
    }
}
