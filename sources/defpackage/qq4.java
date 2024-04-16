package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
/* compiled from: HttpResponse.java */
/* renamed from: qq4  reason: default package */
/* loaded from: classes.dex */
public final class qq4 {
    private final int a;
    private final List<en4> b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public qq4(int i, List<en4> list) {
        this(i, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }

    public final int b() {
        return this.c;
    }

    public final List<en4> c() {
        return Collections.unmodifiableList(this.b);
    }

    public final int d() {
        return this.a;
    }

    public qq4(int i, List<en4> list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }
}
