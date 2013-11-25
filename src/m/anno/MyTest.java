package m.anno;

public class MyTest {
    @MyAnnotation(hello = "xian", world = "china")
    public void hello() {
        System.out.println("Hello ~");
    }

    public void ciao(){
        System.out.println("Ciao ~");
    }
}