package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.huawei.hms.opendevice.c;
import defpackage.o3b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: SwipeVibrationListeners.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0013"}, d2 = {"Lq3b;", "Lo3b;", "Landroid/view/View;", "view", "", "progress", "", c.a, "", "isCompleted", "a", "b", "Landroid/os/Vibrator;", "Landroid/os/Vibrator;", "vibrator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q3b  reason: default package */
/* loaded from: classes2.dex */
public final class q3b implements o3b {
    public static final a b = new a(null);
    public static final int c = 8;
    private static final long[] d = {50, 50, 50, 50, 50, 100, 350, 25, 25, 25, 25, 200};
    private static final int[] e = {33, 51, 75, 113, 170, 255, 0, 38, 62, 100, SyslogConstants.LOG_LOCAL4, 255};
    private static final long[] f = {0, 200, 50, 200};
    private static final long[] g = {0, 50, 100};
    private Vibrator a;

    /* compiled from: SwipeVibrationListeners.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lq3b$a;", "", "", "VIBRATION_COEFICIENT", "I", "", "amplitudes", "[I", "", "duration", "J", "", "negativeVibration", "[J", "positiveVibration", "timings", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: q3b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public q3b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Vibrator vibrator = (Vibrator) iu1.i(context, Vibrator.class);
        if (vibrator != null) {
            this.a = vibrator;
            return;
        }
        throw new IllegalAccessException("SwipeVibrationAnimator couldn't find Vibrator");
    }

    @Override // defpackage.o3b
    public void a(boolean z) {
        long[] jArr;
        VibrationEffect createWaveform;
        if (this.a.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                createWaveform = VibrationEffect.createWaveform(d, e, -1);
                z65.g(createWaveform, "createWaveform(...)");
                this.a.vibrate(createWaveform);
                return;
            }
            if (z) {
                jArr = f;
            } else {
                jArr = g;
            }
            this.a.vibrate(jArr, -1);
        }
    }

    @Override // defpackage.o3b
    public void b() {
        Vibrator vibrator = this.a;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // defpackage.o3b
    public void c(View view, float f2) {
        int e2;
        int h;
        VibrationEffect createOneShot;
        z65.h(view, "view");
        if (this.a.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                e2 = i.e((int) (f2 * 130), 1);
                h = i.h(e2, 255);
                Vibrator vibrator = this.a;
                createOneShot = VibrationEffect.createOneShot(300L, h);
                vibrator.vibrate(createOneShot);
                return;
            }
            this.a.vibrate(300L);
        }
    }

    @Override // defpackage.o3b
    public void d(View view) {
        o3b.a.a(this, view);
    }
}
