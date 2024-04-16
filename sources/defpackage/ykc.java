package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.TelemetryData;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: ykc  reason: default package */
/* loaded from: classes2.dex */
public final class ykc extends b implements l8b {
    private static final a.g k;
    private static final a.AbstractC0215a l;
    private static final a m;
    public static final /* synthetic */ int n = 0;

    static {
        a.g gVar = new a.g();
        k = gVar;
        ukc ukcVar = new ukc();
        l = ukcVar;
        m = new a("ClientTelemetry.API", ukcVar, gVar);
    }

    public ykc(Context context, m8b m8bVar) {
        super(context, m, m8bVar, b.a.c);
    }

    @Override // defpackage.l8b
    public final y6b<Void> a(final TelemetryData telemetryData) {
        h.a a = h.a();
        a.e(ikc.a);
        a.d(false);
        a.c(new yc9() { // from class: tkc
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = ykc.n;
                ((qkc) ((blc) obj).A()).U1(telemetryData2);
                ((a7b) obj2).c(null);
            }
        });
        return h(a.a());
    }
}
