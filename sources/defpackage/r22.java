package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.b;
import defpackage.kz;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: r22  reason: default package */
/* loaded from: classes2.dex */
public class r22 extends b<kz.a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r22(@NonNull Activity activity, @NonNull kz.a aVar) {
        super(activity, kz.f, aVar, (rwa) new im());
    }

    public PendingIntent y(@NonNull HintRequest hintRequest) {
        return w9d.a(q(), p(), hintRequest, p().a());
    }
}
