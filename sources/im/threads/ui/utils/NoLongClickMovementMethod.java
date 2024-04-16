package im.threads.ui.utils;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NoLongClickMovementMethod.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lim/threads/ui/utils/NoLongClickMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "longClickDelay", "", "getLongClickDelay", "()J", "setLongClickDelay", "(J)V", "startTime", "getStartTime", "setStartTime", "onTouchEvent", "", "widget", "Landroid/widget/TextView;", "buffer", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoLongClickMovementMethod extends LinkMovementMethod {
    public static final Companion Companion = new Companion(null);
    private static final NoLongClickMovementMethod linkMovementMethod = new NoLongClickMovementMethod();
    private long longClickDelay = ViewConfiguration.getLongPressTimeout();
    private long startTime;

    public static final LinkMovementMethod getInstance() {
        return Companion.getInstance();
    }

    public final long getLongClickDelay() {
        return this.longClickDelay;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        z65.h(textView, "widget");
        z65.h(spannable, "buffer");
        z65.h(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.startTime = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.startTime >= this.longClickDelay) {
            return true;
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public final void setLongClickDelay(long j) {
        this.longClickDelay = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* compiled from: NoLongClickMovementMethod.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\b"}, d2 = {"Lim/threads/ui/utils/NoLongClickMovementMethod$Companion;", "", "()V", "linkMovementMethod", "Lim/threads/ui/utils/NoLongClickMovementMethod;", "getLinkMovementMethod$annotations", "getInstance", "Landroid/text/method/LinkMovementMethod;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkMovementMethod getInstance() {
            return NoLongClickMovementMethod.linkMovementMethod;
        }

        private static /* synthetic */ void getLinkMovementMethod$annotations() {
        }
    }
}
