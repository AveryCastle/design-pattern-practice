package chap3.template.method;

/**
 * Created by seongjuhyeon on 7/2/16.
 */
public class TemplateMain {

    public static void main(String[] args) {
        AbstractDisplay abstractDisplay1 = new CharDisplay('H');
        abstractDisplay1.display();

        AbstractDisplay abstractDisplay2 = new StringDisplay("Hello, world.");
        abstractDisplay2.display();

        AbstractDisplay abstractDisplay3 = new StringDisplay("안녕하세요.");
        abstractDisplay3.display();
    }
}
