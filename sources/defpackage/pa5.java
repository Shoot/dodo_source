package defpackage;

import java.io.IOException;
import java.io.StringWriter;
/* compiled from: JsonElement.java */
/* renamed from: pa5  reason: default package */
/* loaded from: classes2.dex */
public abstract class pa5 {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public ca5 d() {
        if (k()) {
            return (ca5) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public mb5 f() {
        if (t()) {
            return (mb5) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public qb5 g() {
        if (u()) {
            return (qb5) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean k() {
        return this instanceof ca5;
    }

    public boolean p() {
        return this instanceof lb5;
    }

    public boolean t() {
        return this instanceof mb5;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            dd5 dd5Var = new dd5(stringWriter);
            dd5Var.L(true);
            zya.b(this, dd5Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public boolean u() {
        return this instanceof qb5;
    }
}
