package defpackage;

import android.view.View;
import kotlin.Metadata;
/* compiled from: OffsetCalculator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lvx;", "Lu67;", "Landroid/view/View;", "view", "", "isRight", "", "a", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vx  reason: default package */
/* loaded from: classes.dex */
public final class vx implements u67 {
    @Override // defpackage.u67
    public float a(View view, boolean z) {
        z65.h(view, "view");
        float measuredWidth = (view.getMeasuredWidth() - (view.getPaddingRight() + view.getPaddingLeft())) / 2.0f;
        if (z) {
            return measuredWidth - (0.0625f * measuredWidth);
        }
        return measuredWidth + (0.0625f * measuredWidth);
    }
}
