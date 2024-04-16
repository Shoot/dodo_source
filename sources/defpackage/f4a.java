package defpackage;

import java.io.Writer;
/* compiled from: SegmentedStringWriter.java */
/* renamed from: f4a  reason: default package */
/* loaded from: classes2.dex */
public final class f4a extends Writer {
    private final iab a;

    public f4a(ah0 ah0Var) {
        this.a = new iab(ah0Var);
    }

    public String a() {
        String h = this.a.h();
        this.a.l();
        return h;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.a.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.a.c(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.a.a((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.a.b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.a.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.a.b(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.a.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
