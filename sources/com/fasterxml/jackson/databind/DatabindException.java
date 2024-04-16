package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonProcessingException;
/* loaded from: classes2.dex */
public abstract class DatabindException extends JsonProcessingException {
    protected DatabindException(String str, fb5 fb5Var, Throwable th) {
        super(str, fb5Var, th);
    }

    public abstract void e(Object obj, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindException(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindException(String str, Throwable th) {
        this(str, null, th);
    }
}
