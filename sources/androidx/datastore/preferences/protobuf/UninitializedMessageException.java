package androidx.datastore.preferences.protobuf;

import java.util.List;
/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {
    private final List<String> a;

    public UninitializedMessageException(l0 l0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
