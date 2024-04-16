package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
/* loaded from: classes2.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    protected transient ua5 b;

    /* JADX INFO: Access modifiers changed from: protected */
    public StreamWriteException(String str, ua5 ua5Var) {
        super(str, null);
        this.b = ua5Var;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e */
    public ua5 c() {
        return this.b;
    }
}
