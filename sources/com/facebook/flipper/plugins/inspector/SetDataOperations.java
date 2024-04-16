package com.facebook.flipper.plugins.inspector;

import com.facebook.flipper.core.FlipperDynamic;
import com.facebook.flipper.core.FlipperObject;
/* loaded from: classes2.dex */
public final class SetDataOperations {

    /* loaded from: classes2.dex */
    public enum FlipperValueHint {
        STRING("string"),
        NUMBER("number"),
        OBJECT("object"),
        ARRAY("array"),
        NULL("null");
        
        public final String value;

        FlipperValueHint(String str) {
            this.value = str;
        }

        public static FlipperValueHint fromString(String str) {
            FlipperValueHint[] values;
            for (FlipperValueHint flipperValueHint : values()) {
                if (flipperValueHint.value.equals(str)) {
                    return flipperValueHint;
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class HintedFlipperDynamic {
        public final FlipperValueHint kind;
        public final FlipperDynamic value;

        public HintedFlipperDynamic(FlipperValueHint flipperValueHint, FlipperDynamic flipperDynamic) {
            this.kind = flipperValueHint;
            this.value = flipperDynamic;
        }
    }

    private SetDataOperations() {
    }

    public static HintedFlipperDynamic parseLayoutEditorMessage(FlipperObject flipperObject) {
        return new HintedFlipperDynamic(FlipperValueHint.fromString(flipperObject.getString("kind")), flipperObject.getDynamic("data"));
    }
}
