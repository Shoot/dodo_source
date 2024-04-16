package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
/* compiled from: LPaint.java */
/* renamed from: yi5  reason: default package */
/* loaded from: classes.dex */
public class yi5 extends Paint {
    public yi5() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((ql6.c(i, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(ql6.c(i, 0, 255));
    }

    public yi5(int i) {
        super(i);
    }

    public yi5(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public yi5(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
