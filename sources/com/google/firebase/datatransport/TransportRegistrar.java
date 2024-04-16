package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xlb lambda$getComponents$0(im1 im1Var) {
        lmb.f((Context) im1Var.a(Context.class));
        return lmb.c().g(a.h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(xlb.class).h(LIBRARY_NAME).b(d03.k(Context.class)).f(new rm1() { // from class: kmb
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                xlb lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(im1Var);
                return lambda$getComponents$0;
            }
        }).d(), ep5.b(LIBRARY_NAME, "18.1.8"));
    }
}
