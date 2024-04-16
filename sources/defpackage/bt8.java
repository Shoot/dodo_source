package defpackage;

import com.dodopizza.core.domain.push.a;
/* compiled from: PushModule_ProvideServicePushServiceFactory.java */
/* renamed from: bt8  reason: default package */
/* loaded from: classes3.dex */
public final class bt8 implements no3<xda> {
    private final as8<a> a;

    public bt8(as8<a> as8Var) {
        this.a = as8Var;
    }

    public static bt8 a(as8<a> as8Var) {
        return new bt8(as8Var);
    }

    public static xda c(a aVar) {
        return (xda) jh8.e(vs8.a.f(aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xda get() {
        return c(this.a.get());
    }
}
