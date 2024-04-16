package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.j;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LinearSmoothScrollerToTop.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lfq5;", "Landroidx/recyclerview/widget/j;", "", "B", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "v", "q", "I", "getStartPosition", "()I", "setStartPosition", "(I)V", "startPosition", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "r", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fq5  reason: default package */
/* loaded from: classes.dex */
public final class fq5 extends j {
    public static final a r = new a(null);
    private int q;

    /* compiled from: LinearSmoothScrollerToTop.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lfq5$a;", "", "", "DEFAULT_TIME_PER_INCH", "F", "TIME_FACTOR", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fq5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public fq5(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.j
    protected int B() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.j
    protected float v(DisplayMetrics displayMetrics) {
        z65.h(displayMetrics, "displayMetrics");
        return Math.max(250.0f / Math.max(f() - this.q, 1), 25.0f) / displayMetrics.densityDpi;
    }
}
