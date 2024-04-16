package defpackage;
/* compiled from: MindboxSdkApiFactory_Factory.java */
/* renamed from: vk6  reason: default package */
/* loaded from: classes4.dex */
public final class vk6 implements no3<uk6> {
    private final as8<rn2> a;

    public vk6(as8<rn2> as8Var) {
        this.a = as8Var;
    }

    public static vk6 a(as8<rn2> as8Var) {
        return new vk6(as8Var);
    }

    public static uk6 c(rn2 rn2Var) {
        return new uk6(rn2Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public uk6 get() {
        return c(this.a.get());
    }
}
