package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH$J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\bH\u0004R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lm1;", "T", "", "", "g", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "b", "value", e.a, "(Ljava/lang/Object;)V", c.a, "Lzta;", "a", "Lzta;", "state", "Ljava/lang/Object;", "nextValue", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: m1  reason: default package */
/* loaded from: classes3.dex */
public abstract class m1<T> implements Iterator<T>, be5 {
    private zta a = zta.b;
    private T b;

    /* compiled from: AbstractIterator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[zta.values().length];
            try {
                iArr[zta.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zta.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean g() {
        this.a = zta.d;
        b();
        if (this.a == zta.a) {
            return true;
        }
        return false;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.a = zta.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(T t) {
        this.b = t;
        this.a = zta.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zta ztaVar = this.a;
        if (ztaVar != zta.d) {
            int i = a.$EnumSwitchMapping$0[ztaVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
                return g();
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.a = zta.b;
            return this.b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
