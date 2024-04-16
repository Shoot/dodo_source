package com.fasterxml.jackson.core;

import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class JacksonException extends IOException {
    /* JADX INFO: Access modifiers changed from: protected */
    public JacksonException(String str) {
        super(str);
    }

    public abstract fb5 a();

    public abstract String b();

    public abstract Object c();

    /* JADX INFO: Access modifiers changed from: protected */
    public JacksonException(String str, Throwable th) {
        super(str, th);
    }
}
