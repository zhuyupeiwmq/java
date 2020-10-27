package thread;

public class MyThread  {

    static  void  a(){
        MethodInvocation logTask = () -> System.out.println("log task start");
    }

    public static void main(String[] args) {
        MyThread.a();
    }
}
