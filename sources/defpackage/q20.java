package defpackage;

import java.util.List;
/* compiled from: AutoValue_HeartBeatResult.java */
/* renamed from: q20  reason: default package */
/* loaded from: classes2.dex */
final class q20 extends zn4 {
    private final String a;
    private final List<String> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q20(String str, List<String> list) {
        if (str != null) {
            this.a = str;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // defpackage.zn4
    public List<String> b() {
        return this.b;
    }

    @Override // defpackage.zn4
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zn4)) {
            return false;
        }
        zn4 zn4Var = (zn4) obj;
        if (this.a.equals(zn4Var.c()) && this.b.equals(zn4Var.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
