package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(im1 im1Var) {
        return new a((Context) im1Var.a(Context.class), im1Var.g(jc.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(a.class).h(LIBRARY_NAME).b(d03.k(Context.class)).b(d03.i(jc.class)).f(new rm1() { // from class: p2
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(im1Var);
                return lambda$getComponents$0;
            }
        }).d(), ep5.b(LIBRARY_NAME, "21.1.1"));
    }
}
