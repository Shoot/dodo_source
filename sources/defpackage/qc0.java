package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import defpackage.vc0;
/* compiled from: BlendModeColorFilterCompat.java */
/* renamed from: qc0  reason: default package */
/* loaded from: classes.dex */
public class qc0 {

    /* compiled from: BlendModeColorFilterCompat.java */
    /* renamed from: qc0$a */
    /* loaded from: classes.dex */
    static class a {
        static ColorFilter a(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }

    public static ColorFilter a(int i, @NonNull uc0 uc0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a2 = vc0.b.a(uc0Var);
            if (a2 == null) {
                return null;
            }
            return a.a(i, a2);
        }
        PorterDuff.Mode a3 = vc0.a(uc0Var);
        if (a3 == null) {
            return null;
        }
        return new PorterDuffColorFilter(i, a3);
    }
}
