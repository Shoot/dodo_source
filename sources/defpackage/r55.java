package defpackage;

import android.util.SparseArray;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ActualIntMap.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0012J\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lr55;", "E", "", "", Action.KEY_ATTRIBUTE, "b", "(I)Ljava/lang/Object;", "value", "", c.a, "(ILjava/lang/Object;)V", "a", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "sparseArray", "<init>", "(Landroid/util/SparseArray;)V", "initialCapacity", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: r55  reason: default package */
/* loaded from: classes.dex */
public final class r55<E> {
    private final SparseArray<E> a;

    private r55(SparseArray<E> sparseArray) {
        this.a = sparseArray;
    }

    public final void a() {
        this.a.clear();
    }

    public final E b(int i) {
        return this.a.get(i);
    }

    public final void c(int i, E e) {
        this.a.put(i, e);
    }

    public r55(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ r55(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
