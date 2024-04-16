package defpackage;

import java.io.Serializable;
/* compiled from: PropertyMetadata.java */
/* renamed from: uq8  reason: default package */
/* loaded from: classes2.dex */
public class uq8 implements Serializable {
    public static final uq8 h = new uq8(Boolean.TRUE, null, null, null, null, null, null);
    public static final uq8 i = new uq8(Boolean.FALSE, null, null, null, null, null, null);
    public static final uq8 j = new uq8(null, null, null, null, null, null, null);
    protected final Boolean a;
    protected final String b;
    protected final Integer c;
    protected final String d;
    protected final transient a e;
    protected w37 f;
    protected w37 g;

    /* compiled from: PropertyMetadata.java */
    /* renamed from: uq8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final hl a;
        public final boolean b;

        protected a(hl hlVar, boolean z) {
            this.a = hlVar;
            this.b = z;
        }

        public static a a(hl hlVar) {
            return new a(hlVar, true);
        }

        public static a b(hl hlVar) {
            return new a(hlVar, false);
        }

        public static a c(hl hlVar) {
            return new a(hlVar, false);
        }
    }

    protected uq8(Boolean bool, String str, Integer num, String str2, a aVar, w37 w37Var, w37 w37Var2) {
        this.a = bool;
        this.b = str;
        this.c = num;
        this.d = (str2 == null || str2.isEmpty()) ? null : null;
        this.e = aVar;
        this.f = w37Var;
        this.g = w37Var2;
    }

    public static uq8 a(Boolean bool, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            if (bool == null) {
                return j;
            }
            if (bool.booleanValue()) {
                return h;
            }
            return i;
        }
        return new uq8(bool, str, num, str2, null, null, null);
    }

    public Integer b() {
        return this.c;
    }

    public boolean c() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public uq8 d(String str) {
        return new uq8(this.a, str, this.c, this.d, this.e, this.f, this.g);
    }

    public uq8 e(a aVar) {
        return new uq8(this.a, this.b, this.c, this.d, aVar, this.f, this.g);
    }

    public uq8 f(w37 w37Var, w37 w37Var2) {
        return new uq8(this.a, this.b, this.c, this.d, this.e, w37Var, w37Var2);
    }

    protected Object readResolve() {
        if (this.b == null && this.c == null && this.d == null && this.e == null && this.f == null && this.g == null) {
            Boolean bool = this.a;
            if (bool == null) {
                return j;
            }
            if (bool.booleanValue()) {
                return h;
            }
            return i;
        }
        return this;
    }
}
