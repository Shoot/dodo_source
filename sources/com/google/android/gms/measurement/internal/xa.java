package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class xa implements q4 {
    private final /* synthetic */ String a;
    private final /* synthetic */ va b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xa(va vaVar, String str) {
        this.a = str;
        this.b = vaVar;
    }

    @Override // com.google.android.gms.measurement.internal.q4
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.I(true, i, th, bArr, this.a);
    }
}
