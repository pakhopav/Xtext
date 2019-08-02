package simpleLan;

import com.intellij.lang.Language;

public class SimpleLan extends Language {
    public static final SimpleLan INSTANCE = new SimpleLan();

    private SimpleLan() {
        super("Simple");
    }
}