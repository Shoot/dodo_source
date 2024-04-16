package defpackage;
/* compiled from: AutoValue_LogResponse.java */
/* renamed from: w20  reason: default package */
/* loaded from: classes2.dex */
final class w20 extends zw5 {
    private final long a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w20(long j) {
        this.a = j;
    }

    @Override // defpackage.zw5
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zw5) && this.a == ((zw5) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
