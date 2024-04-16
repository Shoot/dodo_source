package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: AsyncDrawableScheduler.java */
/* renamed from: dy  reason: default package */
/* loaded from: classes3.dex */
public abstract class dy {

    /* compiled from: AsyncDrawableScheduler.java */
    /* renamed from: dy$b */
    /* loaded from: classes3.dex */
    private static class b implements Drawable.Callback {
        private final TextView a;
        private final InterfaceC0293b b;
        private Rect c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncDrawableScheduler.java */
        /* renamed from: dy$b$a */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            final /* synthetic */ Drawable a;

            a(Drawable drawable) {
                this.a = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.invalidateDrawable(this.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncDrawableScheduler.java */
        /* renamed from: dy$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0293b {
            void invalidate();
        }

        b(@NonNull TextView textView, @NonNull InterfaceC0293b interfaceC0293b, Rect rect) {
            this.a = textView;
            this.b = interfaceC0293b;
            this.c = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.a.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (!this.c.equals(bounds)) {
                this.b.invalidate();
                this.c = new Rect(bounds);
                return;
            }
            this.a.postInvalidate();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            this.a.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }
    }

    /* compiled from: AsyncDrawableScheduler.java */
    /* renamed from: dy$c */
    /* loaded from: classes3.dex */
    private static class c implements b.InterfaceC0293b, Runnable {
        private final TextView a;

        c(@NonNull TextView textView) {
            this.a = textView;
        }

        @Override // defpackage.dy.b.InterfaceC0293b
        public void invalidate() {
            this.a.removeCallbacks(this);
            this.a.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.a;
            textView.setText(textView.getText());
        }
    }

    private static ey[] a(@NonNull TextView textView) {
        int i;
        CharSequence text = textView.getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        if (i != 0 && (text instanceof Spanned)) {
            return (ey[]) ((Spanned) text).getSpans(0, i, ey.class);
        }
        return null;
    }

    public static void b(@NonNull TextView textView) {
        int i = oy8.markwon_drawables_scheduler_last_text_hashcode;
        Integer num = (Integer) textView.getTag(i);
        int hashCode = textView.getText().hashCode();
        if (num != null && num.intValue() == hashCode) {
            return;
        }
        textView.setTag(i, Integer.valueOf(hashCode));
        ey[] a2 = a(textView);
        if (a2 != null && a2.length > 0) {
            int i2 = oy8.markwon_drawables_scheduler;
            if (textView.getTag(i2) == null) {
                View.OnAttachStateChangeListener aVar = new a(textView);
                textView.addOnAttachStateChangeListener(aVar);
                textView.setTag(i2, aVar);
            }
            c cVar = new c(textView);
            for (ey eyVar : a2) {
                xx a3 = eyVar.a();
                a3.l(new b(textView, cVar, a3.getBounds()));
            }
        }
    }

    public static void c(@NonNull TextView textView) {
        int i = oy8.markwon_drawables_scheduler_last_text_hashcode;
        if (textView.getTag(i) == null) {
            return;
        }
        textView.setTag(i, null);
        ey[] a2 = a(textView);
        if (a2 != null && a2.length > 0) {
            for (ey eyVar : a2) {
                eyVar.a().l(null);
            }
        }
    }

    /* compiled from: AsyncDrawableScheduler.java */
    /* renamed from: dy$a */
    /* loaded from: classes3.dex */
    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ TextView a;

        a(TextView textView) {
            this.a = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            dy.c(this.a);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(oy8.markwon_drawables_scheduler, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
