package defpackage;

import android.view.MotionEvent;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PointerInputEvent.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, d2 = {"Lyd8;", "", "", "a", "J", "getUptime", "()J", "uptime", "", "Lzd8;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pointers", "Landroid/view/MotionEvent;", c.a, "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yd8  reason: default package */
/* loaded from: classes.dex */
public final class yd8 {
    private final long a;
    private final List<zd8> b;
    private final MotionEvent c;

    public yd8(long j, List<zd8> list, MotionEvent motionEvent) {
        z65.h(list, "pointers");
        z65.h(motionEvent, "motionEvent");
        this.a = j;
        this.b = list;
        this.c = motionEvent;
    }

    public final MotionEvent a() {
        return this.c;
    }

    public final List<zd8> b() {
        return this.b;
    }
}
