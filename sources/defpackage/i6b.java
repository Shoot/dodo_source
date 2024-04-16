package defpackage;

import kotlin.Metadata;
/* compiled from: TakeTypeAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Li6b;", "Ldc;", "Lqc;", "a", "Ll6b;", "Ll6b;", "getSender", "()Ll6b;", "sender", "<init>", "(Ll6b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i6b  reason: default package */
/* loaded from: classes4.dex */
public final class i6b implements dc {
    private final l6b a;

    public i6b(l6b l6bVar) {
        z65.h(l6bVar, "sender");
        this.a = l6bVar;
    }

    @Override // defpackage.dc
    public qc a() {
        return vc.z(bc.e(new bc("change_take_type"), "take_type", "null", false, 4, null), this.a).a();
    }
}
