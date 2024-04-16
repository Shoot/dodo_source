package defpackage;

import defpackage.l91;
/* compiled from: AutoValue_ClientInfo.java */
/* renamed from: j10  reason: default package */
/* loaded from: classes2.dex */
final class j10 extends l91 {
    private final l91.b a;
    private final wf b;

    /* compiled from: AutoValue_ClientInfo.java */
    /* renamed from: j10$b */
    /* loaded from: classes2.dex */
    static final class b extends l91.a {
        private l91.b a;
        private wf b;

        @Override // defpackage.l91.a
        public l91 a() {
            return new j10(this.a, this.b);
        }

        @Override // defpackage.l91.a
        public l91.a b(wf wfVar) {
            this.b = wfVar;
            return this;
        }

        @Override // defpackage.l91.a
        public l91.a c(l91.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // defpackage.l91
    public wf b() {
        return this.b;
    }

    @Override // defpackage.l91
    public l91.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l91)) {
            return false;
        }
        l91 l91Var = (l91) obj;
        l91.b bVar = this.a;
        if (bVar != null ? bVar.equals(l91Var.c()) : l91Var.c() == null) {
            wf wfVar = this.b;
            if (wfVar == null) {
                if (l91Var.b() == null) {
                    return true;
                }
            } else if (wfVar.equals(l91Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        l91.b bVar = this.a;
        int i = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        wf wfVar = this.b;
        if (wfVar != null) {
            i = wfVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    private j10(l91.b bVar, wf wfVar) {
        this.a = bVar;
        this.b = wfVar;
    }
}
