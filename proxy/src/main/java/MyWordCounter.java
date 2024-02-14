public class MyWordCounter implements MyCounter{

    private final String text;

    public MyWordCounter(String url) {
        // Pretending it's need to do some heavy and slow computation when the obj is created
        // Making an Api call to the url and getting the text as response and assign it to the text property
        this.text = url;
    }

    @Override
    public int getWordCount() {
        final String[] splitText = text.split(" ");
        return splitText.length;
    }
}
