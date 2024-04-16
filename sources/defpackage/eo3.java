package defpackage;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.a;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Metadata;
/* compiled from: FCMPushTokenProviderImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Leo3;", "Lut8;", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: eo3  reason: default package */
/* loaded from: classes4.dex */
public final class eo3 implements ut8 {
    private final Context a;

    public eo3(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    @Override // defpackage.ut8
    public String a() {
        if (a.m().g(this.a) == 0) {
            Object a = o7b.a(FirebaseMessaging.l().o());
            z65.g(a, "await(...)");
            return (String) a;
        }
        throw new Resources.NotFoundException("Not found GooglePlayServices");
    }
}
