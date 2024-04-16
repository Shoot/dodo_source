package org.java_websocket.exceptions;
/* loaded from: classes3.dex */
public class IncompleteException extends Exception {
    private final int a;

    public IncompleteException(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
