package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class x7 implements ib {
    private final /* synthetic */ z6 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(z6 z6Var) {
        this.a = z6Var;
    }

    @Override // com.google.android.gms.measurement.internal.ib
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.W("auto", str2, bundle, str);
        } else {
            this.a.z0("auto", str2, bundle);
        }
    }
}
