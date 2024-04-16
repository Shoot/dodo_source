package defpackage;

import defpackage.wo2;
/* compiled from: DeepLinkHandler_KioskOrderStatusUrlBuilder_Factory.java */
/* renamed from: yo2  reason: default package */
/* loaded from: classes3.dex */
public final class yo2 implements no3<wo2.a> {
    private final as8<s80> a;

    public yo2(as8<s80> as8Var) {
        this.a = as8Var;
    }

    public static yo2 a(as8<s80> as8Var) {
        return new yo2(as8Var);
    }

    public static wo2.a c(s80 s80Var) {
        return new wo2.a(s80Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wo2.a get() {
        return c(this.a.get());
    }
}
