package com.huawei.agconnect.exception;
/* loaded from: classes.dex */
public abstract class AGCException extends Exception {
    private int a;
    private String b;

    @Override // java.lang.Throwable
    public String getMessage() {
        return " code: " + this.a + " message: " + this.b;
    }
}
