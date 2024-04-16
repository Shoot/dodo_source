package org.java_websocket.exceptions;
/* loaded from: classes3.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private final int a;

    public IncompleteHandshakeException(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public IncompleteHandshakeException() {
        this.a = 0;
    }
}
