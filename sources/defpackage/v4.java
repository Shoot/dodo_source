package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
/* compiled from: ActionBarPolicy.java */
/* renamed from: v4  reason: default package */
/* loaded from: classes.dex */
public class v4 {
    private Context a;

    private v4(Context context) {
        this.a = context;
    }

    public static v4 b(Context context) {
        return new v4(context);
    }

    public boolean a() {
        if (this.a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i <= 960 || i2 <= 720) {
                if (i <= 720 || i2 <= 960) {
                    if (i < 500) {
                        if (i <= 640 || i2 <= 480) {
                            if (i <= 480 || i2 <= 640) {
                                if (i >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.a.getResources().getDimensionPixelSize(xw8.b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, n29.a, aw8.c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(n29.j, 0);
        Resources resources = this.a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(xw8.a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.a.getResources().getBoolean(dw8.a);
    }

    public boolean h() {
        return true;
    }
}
