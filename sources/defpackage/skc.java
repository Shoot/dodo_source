package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: skc  reason: default package */
/* loaded from: classes2.dex */
public final class skc {
    private final lr a;
    private final lr b;
    private final a7b c;
    private int d;
    private boolean e;

    public final Set a() {
        return this.a.keySet();
    }

    public final void b(mm mmVar, ConnectionResult connectionResult, String str) {
        this.a.put(mmVar, connectionResult);
        this.b.put(mmVar, str);
        this.d--;
        if (!connectionResult.u()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.b(new AvailabilityException(this.a));
                return;
            }
            this.c.c(this.b);
        }
    }
}
