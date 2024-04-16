package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes2.dex */
final class q5 implements Runnable {
    private final /* synthetic */ huc a;
    private final /* synthetic */ zzbe b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(AppMeasurementDynamiteService appMeasurementDynamiteService, huc hucVar, zzbe zzbeVar, String str) {
        this.a = hucVar;
        this.b = zzbeVar;
        this.c = str;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.I().O(this.a, this.b, this.c);
    }
}
