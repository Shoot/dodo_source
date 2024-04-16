package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(im1 im1Var) {
        return new FirebaseMessaging((qv3) im1Var.a(qv3.class), (gw3) im1Var.a(gw3.class), im1Var.g(dub.class), im1Var.g(rn4.class), (ew3) im1Var.a(ew3.class), (xlb) im1Var.a(xlb.class), (j1b) im1Var.a(j1b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(d03.k(qv3.class)).b(d03.h(gw3.class)).b(d03.i(dub.class)).b(d03.i(rn4.class)).b(d03.h(xlb.class)).b(d03.k(ew3.class)).b(d03.k(j1b.class)).f(new rm1() { // from class: mw3
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(im1Var);
                return lambda$getComponents$0;
            }
        }).c().d(), ep5.b(LIBRARY_NAME, "23.4.1"));
    }
}
