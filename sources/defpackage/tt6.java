package defpackage;

import com.dodopizza.chat.feature.chat.presentation.NativeChatPresenter;
/* compiled from: NativeChatPresenter_Factory.java */
/* renamed from: tt6  reason: default package */
/* loaded from: classes.dex */
public final class tt6 implements no3<NativeChatPresenter> {
    private final as8<vt6> a;
    private final as8<gt6> b;
    private final as8<st6> c;
    private final as8<f63> d;
    private final as8<gc> e;
    private final as8<qt6> f;
    private final as8<m37> g;

    public tt6(as8<vt6> as8Var, as8<gt6> as8Var2, as8<st6> as8Var3, as8<f63> as8Var4, as8<gc> as8Var5, as8<qt6> as8Var6, as8<m37> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static tt6 a(as8<vt6> as8Var, as8<gt6> as8Var2, as8<st6> as8Var3, as8<f63> as8Var4, as8<gc> as8Var5, as8<qt6> as8Var6, as8<m37> as8Var7) {
        return new tt6(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static NativeChatPresenter c(vt6 vt6Var, gt6 gt6Var, st6 st6Var, f63 f63Var, gc gcVar, qt6 qt6Var, m37 m37Var) {
        return new NativeChatPresenter(vt6Var, gt6Var, st6Var, f63Var, gcVar, qt6Var, m37Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public NativeChatPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
