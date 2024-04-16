package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<bm1<?>> getComponents() {
        return Arrays.asList(bm1.e(jc.class).b(d03.k(qv3.class)).b(d03.k(Context.class)).b(d03.k(j1b.class)).f(new rm1() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // defpackage.rm1
            public final Object a(im1 im1Var) {
                jc h;
                h = kc.h((qv3) im1Var.a(qv3.class), (Context) im1Var.a(Context.class), (j1b) im1Var.a(j1b.class));
                return h;
            }
        }).e().d(), ep5.b("fire-analytics", "21.5.1"));
    }
}
