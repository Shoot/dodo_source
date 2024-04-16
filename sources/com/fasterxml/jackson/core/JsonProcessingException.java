package com.fasterxml.jackson.core;
/* loaded from: classes2.dex */
public class JsonProcessingException extends JacksonException {
    protected fb5 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str, fb5 fb5Var, Throwable th) {
        super(str, th);
        this.a = fb5Var;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public fb5 a() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public String b() {
        return super.getMessage();
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object c() {
        return null;
    }

    protected String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        fb5 a = a();
        String d = d();
        if (a != null || d != null) {
            StringBuilder sb = new StringBuilder(100);
            sb.append(message);
            if (d != null) {
                sb.append(d);
            }
            if (a != null) {
                sb.append('\n');
                sb.append(" at ");
                sb.append(a.toString());
            }
            return sb.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonProcessingException(String str, fb5 fb5Var) {
        this(str, fb5Var, null);
    }
}
