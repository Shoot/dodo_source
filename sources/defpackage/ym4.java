package defpackage;

import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: ym4  reason: default package */
/* loaded from: classes2.dex */
public class ym4 {
    private int a = 1;

    @NonNull
    public ym4 a(Object obj) {
        int hashCode;
        int i = this.a * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.a = i + hashCode;
        return this;
    }

    public int b() {
        return this.a;
    }

    @NonNull
    public final ym4 c(boolean z) {
        this.a = (this.a * 31) + (z ? 1 : 0);
        return this;
    }
}
