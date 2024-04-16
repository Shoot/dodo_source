package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;
/* loaded from: classes2.dex */
public class JsonGenerationException extends StreamWriteException {
    public JsonGenerationException(String str, ua5 ua5Var) {
        super(str, ua5Var);
        this.b = ua5Var;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* renamed from: e */
    public ua5 c() {
        return this.b;
    }
}
