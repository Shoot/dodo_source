package defpackage;

import defpackage.qba;
/* compiled from: AutoValue_SendRequest.java */
/* renamed from: g30  reason: default package */
/* loaded from: classes2.dex */
final class g30 extends qba {
    private final wlb a;
    private final String b;
    private final pk3<?> c;
    private final zkb<?, byte[]> d;
    private final eh3 e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: g30$b */
    /* loaded from: classes2.dex */
    static final class b extends qba.a {
        private wlb a;
        private String b;
        private pk3<?> c;
        private zkb<?, byte[]> d;
        private eh3 e;

        @Override // defpackage.qba.a
        public qba a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new g30(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.qba.a
        qba.a b(eh3 eh3Var) {
            if (eh3Var != null) {
                this.e = eh3Var;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // defpackage.qba.a
        qba.a c(pk3<?> pk3Var) {
            if (pk3Var != null) {
                this.c = pk3Var;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // defpackage.qba.a
        qba.a d(zkb<?, byte[]> zkbVar) {
            if (zkbVar != null) {
                this.d = zkbVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // defpackage.qba.a
        public qba.a e(wlb wlbVar) {
            if (wlbVar != null) {
                this.a = wlbVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // defpackage.qba.a
        public qba.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // defpackage.qba
    public eh3 b() {
        return this.e;
    }

    @Override // defpackage.qba
    pk3<?> c() {
        return this.c;
    }

    @Override // defpackage.qba
    zkb<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qba)) {
            return false;
        }
        qba qbaVar = (qba) obj;
        if (this.a.equals(qbaVar.f()) && this.b.equals(qbaVar.g()) && this.c.equals(qbaVar.c()) && this.d.equals(qbaVar.e()) && this.e.equals(qbaVar.b())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qba
    public wlb f() {
        return this.a;
    }

    @Override // defpackage.qba
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    private g30(wlb wlbVar, String str, pk3<?> pk3Var, zkb<?, byte[]> zkbVar, eh3 eh3Var) {
        this.a = wlbVar;
        this.b = str;
        this.c = pk3Var;
        this.d = zkbVar;
        this.e = eh3Var;
    }
}
