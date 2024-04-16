package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.a;
import defpackage.dfa;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        zx3.a(dfa.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(im1 im1Var) {
        return a.b((qv3) im1Var.a(qv3.class), (ew3) im1Var.a(ew3.class), im1Var.i(c12.class), im1Var.i(jc.class), im1Var.i(qx3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(a.class).h("fire-cls").b(d03.k(qv3.class)).b(d03.k(ew3.class)).b(d03.a(c12.class)).b(d03.a(jc.class)).b(d03.a(qx3.class)).f(new rm1() { // from class: h12
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                a b;
                b = CrashlyticsRegistrar.this.b(im1Var);
                return b;
            }
        }).e().d(), ep5.b("fire-cls", "18.6.2"));
    }
}
