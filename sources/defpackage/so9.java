package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.main.MainActivity;
/* compiled from: RouteIntentBuilder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lso9;", "", "", Action.KEY_ATTRIBUTE, "value", "b", "uri", "f", "title", e.a, "text", DateTokenConverter.CONVERTER_KEY, "sender", c.a, "Landroid/content/Intent;", "a", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: so9  reason: default package */
/* loaded from: classes3.dex */
public final class so9 {
    private final Intent a;

    public so9(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = new Intent(context, MainActivity.class);
    }

    public final Intent a() {
        this.a.addFlags(335544320);
        return this.a;
    }

    public final so9 b(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, "value");
        this.a.putExtra(str, str2);
        return this;
    }

    public final so9 c(String str) {
        z65.h(str, "sender");
        this.a.putExtra("notification_sender", str);
        return this;
    }

    public final so9 d(String str) {
        z65.h(str, "text");
        this.a.putExtra("notification_text", str);
        return this;
    }

    public final so9 e(String str) {
        z65.h(str, "title");
        this.a.putExtra("notification_title", str);
        return this;
    }

    public final so9 f(String str) {
        z65.h(str, "uri");
        this.a.setDataAndNormalize(Uri.parse(str));
        this.a.putExtra("deeplink_uri_extra", str);
        return this;
    }
}
