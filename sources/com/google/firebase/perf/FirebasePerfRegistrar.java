package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ pw3 lambda$getComponents$0(su8 su8Var, im1 im1Var) {
        return new pw3((qv3) im1Var.a(qv3.class), (xta) im1Var.g(xta.class).get(), (Executor) im1Var.e(su8Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vw3 providesFirebasePerformance(im1 im1Var) {
        im1Var.a(pw3.class);
        return ee2.b().b(new yw3((qv3) im1Var.a(qv3.class), (ew3) im1Var.a(ew3.class), im1Var.g(c.class), im1Var.g(xlb.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<bm1<?>> getComponents() {
        final su8 a = su8.a(bqb.class, Executor.class);
        return Arrays.asList(bm1.e(vw3.class).h(LIBRARY_NAME).b(d03.k(qv3.class)).b(d03.m(c.class)).b(d03.k(ew3.class)).b(d03.m(xlb.class)).b(d03.k(pw3.class)).f(new rm1() { // from class: sw3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                vw3 providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(im1Var);
                return providesFirebasePerformance;
            }
        }).d(), bm1.e(pw3.class).h(EARLY_LIBRARY_NAME).b(d03.k(qv3.class)).b(d03.i(xta.class)).b(d03.j(a)).e().f(new rm1() { // from class: tw3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                pw3 lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(su8.this, im1Var);
                return lambda$getComponents$0;
            }
        }).d(), ep5.b(LIBRARY_NAME, "20.5.2"));
    }
}
