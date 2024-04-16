package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: ActivityManagerImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lo5;", "Ln5;", "", RemoteMessageConst.Notification.URL, "", "b", "deepLink", "a", "Ljm0;", "Ljm0;", "callbackInteractor", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljm0;Landroid/content/Context;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: o5  reason: default package */
/* loaded from: classes.dex */
public final class o5 implements n5 {
    private final jm0 a;
    private final Context b;

    public o5(jm0 jm0Var, Context context) {
        z65.h(jm0Var, "callbackInteractor");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = jm0Var;
        this.b = context;
    }

    @Override // defpackage.n5
    public boolean a(String str) {
        z65.h(str, "deepLink");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.b.getPackageManager()) != null) {
            this.b.startActivity(intent);
            return true;
        }
        return false;
    }

    @Override // defpackage.n5
    public boolean b(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            if (!this.a.a(str) || intent.resolveActivity(this.b.getPackageManager()) != null) {
                return false;
            }
            this.b.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
