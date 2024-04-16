package defpackage;

import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: a7b  reason: default package */
/* loaded from: classes2.dex */
public class a7b<TResult> {
    private final rbd a = new rbd();

    @NonNull
    public y6b<TResult> a() {
        return this.a;
    }

    public void b(@NonNull Exception exc) {
        this.a.t(exc);
    }

    public void c(TResult tresult) {
        this.a.u(tresult);
    }

    public boolean d(@NonNull Exception exc) {
        return this.a.w(exc);
    }

    public boolean e(TResult tresult) {
        return this.a.x(tresult);
    }
}
