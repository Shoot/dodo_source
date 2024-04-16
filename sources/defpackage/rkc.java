package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: rkc  reason: default package */
/* loaded from: classes2.dex */
public final class rkc {
    private final SparseIntArray a = new SparseIntArray();
    private b b;

    public rkc(@NonNull b bVar) {
        gh8.j(bVar);
        this.b = bVar;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(@NonNull Context context, @NonNull a.f fVar) {
        gh8.j(context);
        gh8.j(fVar);
        int i = 0;
        if (!fVar.e()) {
            return 0;
        }
        int k = fVar.k();
        int a = a(context, k);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < this.a.size()) {
                    int keyAt = this.a.keyAt(i2);
                    if (keyAt > k && this.a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                a = this.b.h(context, k);
            } else {
                a = i;
            }
            this.a.put(k, a);
        }
        return a;
    }

    public final void c() {
        this.a.clear();
    }
}
