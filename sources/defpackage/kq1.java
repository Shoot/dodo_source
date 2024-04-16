package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.e;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ConflatedChannel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010+\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`*¢\u0006\u0004\b,\u0010-J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010(\u001a\u00020%8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006."}, d2 = {"Lkq1;", "E", "La1;", "", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "c0", "A", "(Ljava/lang/Object;)Ljava/lang/Object;", "W", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "X", "", "wasClosed", "", "S", "Lz89;", "receive", "M", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/locks/ReentrantLock;", "lock", e.a, "Ljava/lang/Object;", "value", "O", "()Z", "isBufferAlwaysEmpty", "P", "isBufferEmpty", "x", "isBufferAlwaysFull", "y", "isBufferFull", "", "k", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: kq1  reason: default package */
/* loaded from: classes3.dex */
public class kq1<E> extends a1<E> {
    private final ReentrantLock d;
    private Object e;

    public kq1(Function1<? super E, Unit> function1) {
        super(function1);
        this.d = new ReentrantLock();
        this.e = b1.a;
    }

    private final UndeliveredElementException c0(Object obj) {
        Function1<E, Unit> function1;
        Object obj2 = this.e;
        UndeliveredElementException undeliveredElementException = null;
        if (obj2 != b1.a && (function1 = this.a) != null) {
            undeliveredElementException = g97.d(function1, obj2, null, 2, null);
        }
        this.e = obj;
        return undeliveredElementException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e2
    public Object A(E e) {
        b99<E> E;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            ba1<?> m = m();
            if (m != null) {
                return m;
            }
            if (this.e == b1.a) {
                do {
                    E = E();
                    if (E != null) {
                        if (E instanceof ba1) {
                            return E;
                        }
                        z65.e(E);
                    }
                } while (E.l(e, null) == null);
                Unit unit = Unit.a;
                reentrantLock.unlock();
                E.i(e);
                return E.c();
            }
            UndeliveredElementException c0 = c0(e);
            if (c0 == null) {
                return b1.b;
            }
            throw c0;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.a1
    public boolean M(z89<? super E> z89Var) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return super.M(z89Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.a1
    protected final boolean O() {
        return false;
    }

    @Override // defpackage.a1
    protected final boolean P() {
        boolean z;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.e == b1.a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.a1
    public void S(boolean z) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            UndeliveredElementException c0 = c0(b1.a);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            super.S(z);
            if (c0 == null) {
                return;
            }
            throw c0;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.a1
    protected Object W() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            Object obj = this.e;
            r3b r3bVar = b1.a;
            if (obj == r3bVar) {
                Object m = m();
                if (m == null) {
                    m = b1.d;
                }
                return m;
            }
            this.e = r3bVar;
            Unit unit = Unit.a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.a1
    protected Object X(v5a<?> v5aVar) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            Object obj = this.e;
            r3b r3bVar = b1.a;
            if (obj == r3bVar) {
                Object m = m();
                if (m == null) {
                    m = b1.d;
                }
                return m;
            } else if (!v5aVar.o()) {
                return w5a.d();
            } else {
                Object obj2 = this.e;
                this.e = r3bVar;
                Unit unit = Unit.a;
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.e2
    protected String k() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            return "(value=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.e2
    protected final boolean x() {
        return false;
    }

    @Override // defpackage.e2
    protected final boolean y() {
        return false;
    }
}
