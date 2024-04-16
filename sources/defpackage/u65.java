package defpackage;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: InternalPointerEvent.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\rø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lu65;", "", "Lvd8;", "pointerId", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "", "Lwd8;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "changes", "Lyd8;", "b", "Lyd8;", "getPointerInputEvent", "()Lyd8;", "pointerInputEvent", c.a, "Z", "()Z", "setSuppressMovementConsumption", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/Map;Lyd8;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: u65  reason: default package */
/* loaded from: classes.dex */
public final class u65 {
    private final Map<vd8, wd8> a;
    private final yd8 b;
    private boolean c;

    public u65(Map<vd8, wd8> map, yd8 yd8Var) {
        z65.h(map, "changes");
        z65.h(yd8Var, "pointerInputEvent");
        this.a = map;
        this.b = yd8Var;
    }

    public final Map<vd8, wd8> a() {
        return this.a;
    }

    public final MotionEvent b() {
        return this.b.a();
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d(long j) {
        zd8 zd8Var;
        List<zd8> b = this.b.b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i < size) {
                zd8Var = b.get(i);
                if (vd8.d(zd8Var.c(), j)) {
                    break;
                }
                i++;
            } else {
                zd8Var = null;
                break;
            }
        }
        zd8 zd8Var2 = zd8Var;
        if (zd8Var2 == null) {
            return false;
        }
        return zd8Var2.d();
    }
}
