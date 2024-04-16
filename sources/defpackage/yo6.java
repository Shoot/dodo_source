package defpackage;

import android.view.MotionEvent;
import kotlin.Metadata;
/* compiled from: MotionEventAdapter.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lyo6;", "", "Landroid/view/MotionEvent;", "motionEvent", "", "index", "Ls67;", "a", "(Landroid/view/MotionEvent;I)J", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yo6  reason: default package */
/* loaded from: classes.dex */
final class yo6 {
    public static final yo6 a = new yo6();

    private yo6() {
    }

    public final long a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        z65.h(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return x67.a(rawX, rawY);
    }
}
