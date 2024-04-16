package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: BaseAnimatableValue.java */
/* renamed from: z60  reason: default package */
/* loaded from: classes.dex */
abstract class z60<V, O> implements dk<V, O> {
    final List<lg5<V>> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z60(List<lg5<V>> list) {
        this.a = list;
    }

    @Override // defpackage.dk
    public List<lg5<V>> b() {
        return this.a;
    }

    @Override // defpackage.dk
    public boolean c() {
        if (this.a.isEmpty()) {
            return true;
        }
        if (this.a.size() == 1 && this.a.get(0).h()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
