package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(su8 su8Var, im1 im1Var) {
        return new c((Context) im1Var.a(Context.class), (ScheduledExecutorService) im1Var.e(su8Var), (qv3) im1Var.a(qv3.class), (ew3) im1Var.a(ew3.class), ((com.google.firebase.abt.component.a) im1Var.a(com.google.firebase.abt.component.a.class)).b("frc"), im1Var.g(jc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        final su8 a = su8.a(rd0.class, ScheduledExecutorService.class);
        return Arrays.asList(bm1.f(c.class, qx3.class).h(LIBRARY_NAME).b(d03.k(Context.class)).b(d03.j(a)).b(d03.k(qv3.class)).b(d03.k(ew3.class)).b(d03.k(com.google.firebase.abt.component.a.class)).b(d03.i(jc.class)).f(new rm1() { // from class: kd9
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(su8.this, im1Var);
                return lambda$getComponents$0;
            }
        }).e().d(), ep5.b(LIBRARY_NAME, "21.6.3"));
    }
}
