package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: VibratorUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"Landroidx/fragment/app/Fragment;", "", DateTokenConverter.CONVERTER_KEY, "", "durationMillis", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, c.a, "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: jyb  reason: default package */
/* loaded from: classes.dex */
public final class jyb {
    public static final void a(Fragment fragment, long j) {
        z65.h(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        z65.g(requireContext, "requireContext(...)");
        c(requireContext, j);
    }

    public static /* synthetic */ void b(Fragment fragment, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        a(fragment, j);
    }

    private static final void c(Context context, long j) {
        VibrationEffect createOneShot;
        try {
            Object systemService = context.getSystemService("vibrator");
            z65.f(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(j, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(j);
            }
        } catch (SecurityException unused) {
        }
    }

    public static final void d(Fragment fragment) {
        z65.h(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        z65.g(requireContext, "requireContext(...)");
        c(requireContext, 100L);
    }
}
