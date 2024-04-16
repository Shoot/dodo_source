package defpackage;

import defpackage.wlb;
import java.util.Arrays;
/* compiled from: AutoValue_TransportContext.java */
/* renamed from: n30  reason: default package */
/* loaded from: classes2.dex */
final class n30 extends wlb {
    private final String a;
    private final byte[] b;
    private final xj8 c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: n30$b */
    /* loaded from: classes2.dex */
    static final class b extends wlb.a {
        private String a;
        private byte[] b;
        private xj8 c;

        @Override // defpackage.wlb.a
        public wlb a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new n30(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.wlb.a
        public wlb.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // defpackage.wlb.a
        public wlb.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // defpackage.wlb.a
        public wlb.a d(xj8 xj8Var) {
            if (xj8Var != null) {
                this.c = xj8Var;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // defpackage.wlb
    public String b() {
        return this.a;
    }

    @Override // defpackage.wlb
    public byte[] c() {
        return this.b;
    }

    @Override // defpackage.wlb
    public xj8 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        byte[] c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wlb)) {
            return false;
        }
        wlb wlbVar = (wlb) obj;
        if (this.a.equals(wlbVar.b())) {
            byte[] bArr = this.b;
            if (wlbVar instanceof n30) {
                c = ((n30) wlbVar).b;
            } else {
                c = wlbVar.c();
            }
            if (Arrays.equals(bArr, c) && this.c.equals(wlbVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    private n30(String str, byte[] bArr, xj8 xj8Var) {
        this.a = str;
        this.b = bArr;
        this.c = xj8Var;
    }
}
