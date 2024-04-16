package defpackage;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.h;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: i55  reason: default package */
/* loaded from: classes2.dex */
public class i55 extends b<a.d.c> {
    private final cnc k;

    public i55(@NonNull Context context) {
        super(context, g55.c, a.d.I4, b.a.c);
        this.k = new cnc();
    }

    @NonNull
    public y6b<Boolean> y() {
        return i(h.a().b(new xa0() { // from class: szc
            @Override // defpackage.xa0
            public final void a(Object obj, Object obj2) {
                inc incVar = (inc) obj;
                a7b a7bVar = (a7b) obj2;
                try {
                    ((gad) incVar.A()).T1(new r0d(i55.this, a7bVar));
                } catch (RemoteException e) {
                    a7bVar.d(e);
                }
            }
        }).e(emc.a).f(4805).a());
    }
}
