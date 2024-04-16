package defpackage;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ActivityStartTryBuilder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lc6;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Intent;)V", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lkotlin/Function0;", "", c.a, "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", e.a, "(Lkotlin/jvm/functions/Function0;)V", "onNotFound", "<init>", "(Landroid/content/Context;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 {
    private final Context a;
    private Intent b;
    private Function0<Unit> c;

    public c6(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    public final Context a() {
        return this.a;
    }

    public final Intent b() {
        return this.b;
    }

    public final Function0<Unit> c() {
        return this.c;
    }

    public final void d(Intent intent) {
        this.b = intent;
    }

    public final void e(Function0<Unit> function0) {
        this.c = function0;
    }
}
