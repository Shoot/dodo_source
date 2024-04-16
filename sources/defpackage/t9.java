package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* compiled from: AesCmacParameters.java */
/* renamed from: t9  reason: default package */
/* loaded from: classes2.dex */
public final class t9 extends f46 {
    private final int a;
    private final a b;

    /* compiled from: AesCmacParameters.java */
    /* renamed from: t9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a b = new a("TINK");
        public static final a c = new a("CRUNCHY");
        public static final a d = new a("LEGACY");
        public static final a e = new a("NO_PREFIX");
        private final String a;

        private a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    private t9(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public static t9 a(int i, a aVar) throws GeneralSecurityException {
        if (i >= 10 && 16 >= i) {
            return new t9(i, aVar);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        int b;
        a aVar = this.b;
        if (aVar == a.e) {
            return b();
        }
        if (aVar == a.b) {
            b = b();
        } else if (aVar == a.c) {
            b = b();
        } else if (aVar == a.d) {
            b = b();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return b + 5;
    }

    public a d() {
        return this.b;
    }

    public boolean e() {
        if (this.b != a.e) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        if (t9Var.c() != c() || t9Var.d() != d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.b + ", " + this.a + "-byte tags)";
    }
}
