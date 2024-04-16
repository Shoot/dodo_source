package defpackage;

import java.util.Collection;
/* compiled from: PaymentModule_ProvideAcquirerListFactory.java */
/* renamed from: hu7  reason: default package */
/* loaded from: classes3.dex */
public final class hu7 implements no3<Collection<String>> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PaymentModule_ProvideAcquirerListFactory.java */
    /* renamed from: hu7$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private static final hu7 a = new hu7();
    }

    public static hu7 a() {
        return a.a;
    }

    public static Collection<String> c() {
        return (Collection) jh8.e(gu7.a.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Collection<String> get() {
        return c();
    }
}
