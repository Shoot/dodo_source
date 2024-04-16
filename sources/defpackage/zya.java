package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* compiled from: Streams.java */
/* renamed from: zya  reason: default package */
/* loaded from: classes2.dex */
public final class zya {
    public static pa5 a(yb5 yb5Var) throws JsonParseException {
        boolean z;
        try {
            try {
                yb5Var.N();
                z = false;
                try {
                    return TypeAdapters.U.read(yb5Var);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return lb5.a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    public static void b(pa5 pa5Var, dd5 dd5Var) throws IOException {
        TypeAdapters.U.write(dd5Var, pa5Var);
    }

    public static Writer c(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new a(appendable);
    }

    /* compiled from: Streams.java */
    /* renamed from: zya$a */
    /* loaded from: classes2.dex */
    private static final class a extends Writer {
        private final Appendable a;
        private final C0774a b = new C0774a();

        /* compiled from: Streams.java */
        /* renamed from: zya$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0774a implements CharSequence {
            char[] a;

            C0774a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C0774a c0774a = this.b;
            c0774a.a = cArr;
            this.a.append(c0774a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.a.append((char) i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
