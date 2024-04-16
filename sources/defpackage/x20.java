package defpackage;

import defpackage.zv6;
/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* renamed from: x20  reason: default package */
/* loaded from: classes2.dex */
final class x20 extends zv6 {
    private final zv6.c a;
    private final zv6.b b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* renamed from: x20$b */
    /* loaded from: classes2.dex */
    static final class b extends zv6.a {
        private zv6.c a;
        private zv6.b b;

        @Override // defpackage.zv6.a
        public zv6 a() {
            return new x20(this.a, this.b);
        }

        @Override // defpackage.zv6.a
        public zv6.a b(zv6.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // defpackage.zv6.a
        public zv6.a c(zv6.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // defpackage.zv6
    public zv6.b b() {
        return this.b;
    }

    @Override // defpackage.zv6
    public zv6.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv6)) {
            return false;
        }
        zv6 zv6Var = (zv6) obj;
        zv6.c cVar = this.a;
        if (cVar != null ? cVar.equals(zv6Var.c()) : zv6Var.c() == null) {
            zv6.b bVar = this.b;
            if (bVar == null) {
                if (zv6Var.b() == null) {
                    return true;
                }
            } else if (bVar.equals(zv6Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        zv6.c cVar = this.a;
        int i = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        zv6.b bVar = this.b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    private x20(zv6.c cVar, zv6.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
