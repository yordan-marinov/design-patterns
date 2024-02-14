import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyWordCounterProxy implements MyCounter{

    private final String url;

    @Override
    public int getWordCount() {
        final MyWordCounter myWordCounter = new MyWordCounter(url);
        return myWordCounter.getWordCount();
    }
}
