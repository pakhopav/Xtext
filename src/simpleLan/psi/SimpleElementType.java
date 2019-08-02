package simpleLan.psi;

import com.intellij.psi.tree.IElementType;
import simpleLan.SimpleLan;
import org.jetbrains.annotations.*;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLan.INSTANCE);
    }
}