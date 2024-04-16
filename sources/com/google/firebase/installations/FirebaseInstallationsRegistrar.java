package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ew3 lambda$getComponents$0(im1 im1Var) {
        return new c((qv3) im1Var.a(qv3.class), im1Var.g(qn4.class), (ExecutorService) im1Var.e(su8.a(d60.class, ExecutorService.class)), yv3.b((Executor) im1Var.e(su8.a(rd0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(ew3.class).h(LIBRARY_NAME).b(d03.k(qv3.class)).b(d03.i(qn4.class)).b(d03.j(su8.a(d60.class, ExecutorService.class))).b(d03.j(su8.a(rd0.class, Executor.class))).f(new rm1() { // from class: fw3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                ew3 lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(im1Var);
                return lambda$getComponents$0;
            }
        }).d(), pn4.a(), ep5.b(LIBRARY_NAME, "17.2.0"));
    }
}
