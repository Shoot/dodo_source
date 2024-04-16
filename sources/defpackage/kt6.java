package defpackage;

import im.threads.ui.core.ThreadsLib;
/* compiled from: NativeChatDomainModule_ProvideNativeChatUserInitializer$chat_releaseFactory.java */
/* renamed from: kt6  reason: default package */
/* loaded from: classes.dex */
public final class kt6 implements no3<bu6> {
    private final as8<mfb> a;
    private final as8<ThreadsLib> b;
    private final as8<ut8> c;
    private final as8<hfb> d;

    public kt6(as8<mfb> as8Var, as8<ThreadsLib> as8Var2, as8<ut8> as8Var3, as8<hfb> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static kt6 a(as8<mfb> as8Var, as8<ThreadsLib> as8Var2, as8<ut8> as8Var3, as8<hfb> as8Var4) {
        return new kt6(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static bu6 c(mfb mfbVar, as8<ThreadsLib> as8Var, ut8 ut8Var, hfb hfbVar) {
        return (bu6) jh8.e(ht6.a.c(mfbVar, as8Var, ut8Var, hfbVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bu6 get() {
        return c(this.a.get(), this.b, this.c.get(), this.d.get());
    }
}
