package org.java_websocket.exceptions;
/* loaded from: classes3.dex */
public class LimitExceededException extends InvalidDataException {
    private final int b;

    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }

    public int b() {
        return this.b;
    }

    public LimitExceededException(int i) {
        super(1009);
        this.b = i;
    }

    public LimitExceededException(String str, int i) {
        super(1009, str);
        this.b = i;
    }

    public LimitExceededException(String str) {
        this(str, Integer.MAX_VALUE);
    }
}
