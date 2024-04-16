package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.5.1 */
/* loaded from: classes2.dex */
final class h8 implements Runnable {
    private final /* synthetic */ huc a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h8(AppMeasurementDynamiteService appMeasurementDynamiteService, huc hucVar, String str, String str2, boolean z) {
        this.a = hucVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.I().Q(this.a, this.b, this.c, this.d);
    }
}
