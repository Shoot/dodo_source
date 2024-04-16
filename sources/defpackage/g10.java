package defpackage;

import defpackage.b60;
import java.util.Arrays;
/* compiled from: AutoValue_BackendRequest.java */
/* renamed from: g10  reason: default package */
/* loaded from: classes2.dex */
final class g10 extends b60 {
    private final Iterable<wk3> a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* renamed from: g10$b */
    /* loaded from: classes2.dex */
    public static final class b extends b60.a {
        private Iterable<wk3> a;
        private byte[] b;

        @Override // defpackage.b60.a
        public b60 a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new g10(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.b60.a
        public b60.a b(Iterable<wk3> iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // defpackage.b60.a
        public b60.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // defpackage.b60
    public Iterable<wk3> b() {
        return this.a;
    }

    @Override // defpackage.b60
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        byte[] c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj;
        if (this.a.equals(b60Var.b())) {
            byte[] bArr = this.b;
            if (b60Var instanceof g10) {
                c = ((g10) b60Var).b;
            } else {
                c = b60Var.c();
            }
            if (Arrays.equals(bArr, c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    private g10(Iterable<wk3> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
