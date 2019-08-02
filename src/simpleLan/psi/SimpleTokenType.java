package simpleLan.psi;


import com.intellij.psi.tree.IElementType;
import simpleLan.SimpleLan;
import org.jetbrains.annotations.*;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLan.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}