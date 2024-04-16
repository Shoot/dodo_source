package defpackage;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
/* compiled from: MotionEventCompat.java */
/* renamed from: vo6  reason: default package */
/* loaded from: classes.dex */
public final class vo6 {
    public static boolean a(@NonNull MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }
}
