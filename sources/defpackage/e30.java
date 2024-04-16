package defpackage;

import defpackage.zv9;
import java.util.Map;
/* compiled from: AutoValue_SchedulerConfig.java */
/* renamed from: e30  reason: default package */
/* loaded from: classes2.dex */
final class e30 extends zv9 {
    private final x91 a;
    private final Map<xj8, zv9.b> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e30(x91 x91Var, Map<xj8, zv9.b> map) {
        if (x91Var != null) {
            this.a = x91Var;
            if (map != null) {
                this.b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // defpackage.zv9
    x91 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv9)) {
            return false;
        }
        zv9 zv9Var = (zv9) obj;
        if (this.a.equals(zv9Var.e()) && this.b.equals(zv9Var.h())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zv9
    Map<xj8, zv9.b> h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
