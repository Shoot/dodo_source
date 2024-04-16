package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes2.dex */
final class ga implements Runnable {
    private final /* synthetic */ huc a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga(AppMeasurementDynamiteService appMeasurementDynamiteService, huc hucVar, String str, String str2) {
        this.a = hucVar;
        this.b = str;
        this.c = str2;
        this.d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.I().P(this.a, this.b, this.c);
    }
}
