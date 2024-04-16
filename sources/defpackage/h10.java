package defpackage;

import defpackage.c60;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_BackendResponse.java */
/* renamed from: h10  reason: default package */
/* loaded from: classes2.dex */
public final class h10 extends c60 {
    private final c60.a a;
    private final long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h10(c60.a aVar, long j) {
        if (aVar != null) {
            this.a = aVar;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.c60
    public long b() {
        return this.b;
    }

    @Override // defpackage.c60
    public c60.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c60)) {
            return false;
        }
        c60 c60Var = (c60) obj;
        if (this.a.equals(c60Var.c()) && this.b == c60Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
