public class Boy {
    Agrement agrement;//*

    public Boy(Agrement agrement){
        this.agrement = agrement; //class eka athule thina property eka thamai access krnne *
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());//Contructor eka call wena welawe thamai dependency eka inject krnne class ekt
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
