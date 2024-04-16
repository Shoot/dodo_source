package defpackage;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.fragment.app.d;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: gp5  reason: default package */
/* loaded from: classes2.dex */
public class gp5 {
    private final Object a;

    public gp5(@NonNull Activity activity) {
        gh8.k(activity, "Activity must not be null");
        this.a = activity;
    }

    @NonNull
    public final Activity a() {
        return (Activity) this.a;
    }

    @NonNull
    public final d b() {
        return (d) this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof d;
    }
}
