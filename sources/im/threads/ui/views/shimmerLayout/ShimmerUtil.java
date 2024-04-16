package im.threads.ui.views.shimmerLayout;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ShimmerUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bJ-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lim/threads/ui/views/shimmerLayout/ShimmerUtil;", "", "()V", "getColor", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "id", "getColor$threads_release", "getShimmerShader", "Landroid/graphics/Shader;", "width", "angle", "", "shadowWidth", "shadowCenter", "getShimmerShader$threads_release", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerUtil {
    public static final ShimmerUtil INSTANCE = new ShimmerUtil();

    private ShimmerUtil() {
    }

    public final int getColor$threads_release(Context context, int i) {
        int color;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (Build.VERSION.SDK_INT >= 23) {
            color = context.getColor(i);
            return color;
        }
        return context.getResources().getColor(i);
    }

    public final Shader getShimmerShader$threads_release(int i, double d, int i2, int i3) {
        float f = i;
        float f2 = (i2 / 2.0f) / f;
        float f3 = (i3 / 2.0f) / f;
        double radians = Math.toRadians(d);
        return new LinearGradient(0.0f, 0.0f, ((float) Math.cos(radians)) * f, ((float) Math.sin(radians)) * f, new int[]{0, -16777216, -16777216, 0}, new float[]{0.5f - f2, 0.5f - f3, f3 + 0.5f, f2 + 0.5f}, Shader.TileMode.CLAMP);
    }
}
