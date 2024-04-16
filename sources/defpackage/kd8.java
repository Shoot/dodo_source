package defpackage;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PointerEvent.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010\"J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u00020\u00118\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0004R \u0010\u0017\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R3\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028\u0006@@X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkd8;", "", "Lnd8;", "a", "()I", "", "Lwd8;", "Ljava/util/List;", c.a, "()Ljava/util/List;", "changes", "Lu65;", "b", "Lu65;", "getInternalPointerEvent$ui_release", "()Lu65;", "internalPointerEvent", "Lid8;", "I", "buttons", "Lje8;", DateTokenConverter.CONVERTER_KEY, "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", e.a, "f", "(I)V", MessageAttributes.TYPE, "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/List;Lu65;)V", "(Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kd8  reason: default package */
/* loaded from: classes.dex */
public final class kd8 {
    private final List<wd8> a;
    private final u65 b;
    private final int c;
    private final int d;
    private int e;

    public kd8(List<wd8> list, u65 u65Var) {
        z65.h(list, "changes");
        this.a = list;
        this.b = u65Var;
        MotionEvent d = d();
        this.c = id8.a(d != null ? d.getButtonState() : 0);
        MotionEvent d2 = d();
        this.d = je8.b(d2 != null ? d2.getMetaState() : 0);
        this.e = a();
    }

    private final int a() {
        MotionEvent d = d();
        if (d != null) {
            int actionMasked = d.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return nd8.a.f();
                            case 9:
                                return nd8.a.a();
                            case 10:
                                return nd8.a.b();
                            default:
                                return nd8.a.g();
                        }
                    }
                    return nd8.a.c();
                }
                return nd8.a.e();
            }
            return nd8.a.d();
        }
        List<wd8> list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wd8 wd8Var = list.get(i);
            if (ld8.d(wd8Var)) {
                return nd8.a.e();
            }
            if (ld8.b(wd8Var)) {
                return nd8.a.d();
            }
        }
        return nd8.a.c();
    }

    public final int b() {
        return this.c;
    }

    public final List<wd8> c() {
        return this.a;
    }

    public final MotionEvent d() {
        u65 u65Var = this.b;
        if (u65Var != null) {
            return u65Var.b();
        }
        return null;
    }

    public final int e() {
        return this.e;
    }

    public final void f(int i) {
        this.e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kd8(List<wd8> list) {
        this(list, null);
        z65.h(list, "changes");
    }
}
