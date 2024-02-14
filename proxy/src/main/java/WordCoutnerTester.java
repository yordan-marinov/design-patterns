public class WordCoutnerTester {

    public static void main(String[] args) {
        final String textExample = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.\s
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\s
                when an unknown printer took a galley of type and scrambled it to make a type specimen book.\s
                It has survived not only five centuries, but also the leap into electronic typesetting,\s
                remaining essentially unchanged.\s
                It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,\s
                and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                """;
        MyCounter myWordCounter = new MyWordCounterProxy(textExample);
        final int wordCount = myWordCounter.getWordCount();
        System.out.println(">>> Count is: " + wordCount + " words.");
    }
}
