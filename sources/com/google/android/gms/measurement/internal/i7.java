package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes2.dex */
final class i7 implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService.b a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i7(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.a = bVar;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.G().d0(this.a);
    }
}
