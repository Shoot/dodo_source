package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MotionEventAdapter.android.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010#\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Luo6;", "", "Landroid/view/MotionEvent;", "motionEvent", "", "a", Image.TYPE_HIGH, "", "pointerId", "", "g", "motionEventPointerId", "Lvd8;", "f", "(I)J", "b", "Lvf8;", "positionCalculator", "index", "pressed", "Lzd8;", DateTokenConverter.CONVERTER_KEY, "Lyd8;", c.a, "(Landroid/view/MotionEvent;Lvf8;)Lyd8;", e.a, "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uo6  reason: default package */
/* loaded from: classes.dex */
public final class uo6 {
    private long a;
    private final SparseLongArray b = new SparseLongArray();
    private final SparseBooleanArray c = new SparseBooleanArray();
    private final List<zd8> d = new ArrayList();
    private int e = -1;
    private int f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.b.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.b;
                    long j = this.a;
                    this.a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.b;
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.e || source != this.f) {
            this.e = toolType;
            this.f = source;
            this.c.clear();
            this.b.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.zd8 d(defpackage.vf8 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo6.d(vf8, android.view.MotionEvent, int, boolean):zd8");
    }

    private final long f(int i) {
        long j;
        int indexOfKey = this.b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.b.valueAt(indexOfKey);
        } else {
            j = this.a;
            this.a = 1 + j;
            this.b.put(i, j);
        }
        return vd8.b(j);
    }

    private final boolean g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId, false)) {
                this.b.delete(pointerId);
                this.c.delete(pointerId);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            for (int size = this.b.size() - 1; -1 < size; size--) {
                int keyAt = this.b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.b.removeAt(size);
                    this.c.delete(keyAt);
                }
            }
        }
    }

    public final yd8 c(MotionEvent motionEvent, vf8 vf8Var) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        z65.h(motionEvent, "motionEvent");
        z65.h(vf8Var, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z = false;
        } else {
            z = true;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i = -1;
            } else {
                i = motionEvent.getActionIndex();
            }
        } else {
            i = 0;
        }
        this.d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List<zd8> list = this.d;
            if (!z && i2 != i && (!z2 || motionEvent.getButtonState() != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            list.add(d(vf8Var, motionEvent, i2, z3));
        }
        h(motionEvent);
        return new yd8(motionEvent.getEventTime(), this.d, motionEvent);
    }

    public final void e(int i) {
        this.c.delete(i);
        this.b.delete(i);
    }
}
