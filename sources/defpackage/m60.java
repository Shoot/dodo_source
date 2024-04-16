package defpackage;

import android.content.res.Resources;
import com.google.android.material.badge.a;
import com.huawei.hms.opendevice.c;
import java.lang.reflect.Method;
import kotlin.Metadata;
/* compiled from: BadgeDrawableHacks.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lm60;", "", "Lcom/google/android/material/badge/a;", "badge", "", "styleId", "", c.a, "offset", "a", "Landroid/content/res/Resources;", "resources", "b", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: m60  reason: default package */
/* loaded from: classes4.dex */
public final class m60 {
    public static final m60 a = new m60();

    private m60() {
    }

    public final int a(a aVar, int i) {
        z65.h(aVar, "badge");
        return aVar.getIntrinsicWidth() - i;
    }

    public final int b(Resources resources) {
        z65.h(resources, "resources");
        return resources.getDimensionPixelSize(ww8.mtrl_badge_text_horizontal_edge_offset);
    }

    public final void c(a aVar, int i) {
        z65.h(aVar, "badge");
        Method declaredMethod = a.class.getDeclaredMethod("G", Integer.TYPE);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(aVar, Integer.valueOf(i));
    }
}
