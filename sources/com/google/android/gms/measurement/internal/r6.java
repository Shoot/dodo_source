package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes2.dex */
final class r6 implements Runnable {
    private final /* synthetic */ huc a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6(AppMeasurementDynamiteService appMeasurementDynamiteService, huc hucVar) {
        this.a = hucVar;
        this.b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.I().N(this.a);
    }
}
