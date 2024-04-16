package defpackage;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: InAppMessageViewDisplayer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&¨\u0006\u0013"}, d2 = {"Liy4;", "", "Landroid/app/Activity;", "activity", "", "shouldUseBlur", "", "a", c.a, "b", "Lqz4;", "inAppType", "Lh87;", "onInAppClick", "Li87;", "onInAppShown", "f", e.a, DateTokenConverter.CONVERTER_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: iy4  reason: default package */
/* loaded from: classes.dex */
public interface iy4 {
    void a(Activity activity, boolean z);

    void b(Activity activity);

    void c(Activity activity);

    boolean d();

    void e(Activity activity, boolean z);

    void f(qz4 qz4Var, h87 h87Var, i87 i87Var);
}
