public class App {
    public static void main(String[] args) throws Exception{
        InputParse readF = new InputParse();
        // readF.InputParse();
        AddToFile ts = new AddToFile();

        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }
}