package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
/* loaded from: classes2.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new yb5(reader));
    }

    public final T fromJsonTree(pa5 pa5Var) {
        try {
            return read(new com.google.gson.internal.bind.a(pa5Var));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return (T) TypeAdapter.this.read(yb5Var);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(dd5 dd5Var, T t) throws IOException {
                if (t == null) {
                    dd5Var.s();
                } else {
                    TypeAdapter.this.write(dd5Var, t);
                }
            }
        };
    }

    public abstract T read(yb5 yb5Var) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new dd5(writer), t);
    }

    public final pa5 toJsonTree(T t) {
        try {
            oc5 oc5Var = new oc5();
            write(oc5Var, t);
            return oc5Var.e0();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(dd5 dd5Var, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
