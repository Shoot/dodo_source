package defpackage;

import kotlin.Metadata;
/* compiled from: TakeTypeAnalytics.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lj6b;", "Ldc;", "Lqc;", "a", "Lk6b;", "Lk6b;", "getTakeType", "()Lk6b;", "takeType", "Ll6b;", "b", "Ll6b;", "getSender", "()Ll6b;", "sender", "<init>", "(Lk6b;Ll6b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j6b  reason: default package */
/* loaded from: classes4.dex */
public final class j6b implements dc {
    private final k6b a;
    private final l6b b;

    public j6b(k6b k6bVar, l6b l6bVar) {
        z65.h(k6bVar, "takeType");
        z65.h(l6bVar, "sender");
        this.a = k6bVar;
        this.b = l6bVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("change_take_type"), "take_type", this.a.getValue(), false, 4, null), this.b).a();
    }
}
