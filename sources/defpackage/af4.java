package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
/* compiled from: GestureDetectorCompat.java */
/* renamed from: af4  reason: default package */
/* loaded from: classes.dex */
public final class af4 {
    private final a a;

    /* compiled from: GestureDetectorCompat.java */
    /* renamed from: af4$a */
    /* loaded from: classes.dex */
    interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat.java */
    /* renamed from: af4$b */
    /* loaded from: classes.dex */
    static class b implements a {
        private final GestureDetector a;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // defpackage.af4.a
        public boolean a(MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    public af4(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(@NonNull MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }

    public af4(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new b(context, onGestureListener, handler);
    }
}
