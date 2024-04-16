package org.java_websocket.exceptions;
/* loaded from: classes3.dex */
public class InvalidDataException extends Exception {
    private final int a;

    public InvalidDataException(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.a = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}
