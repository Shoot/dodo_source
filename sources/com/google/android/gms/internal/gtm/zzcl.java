package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* loaded from: classes2.dex */
public final class zzcl implements Callable<String> {
    final /* synthetic */ zzcn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        return this.zza.zzc();
    }
}
