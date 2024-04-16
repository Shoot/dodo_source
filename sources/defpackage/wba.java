package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.sk9;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lwba;", "T", "Lxba;", "", "Lcv1;", "", Image.TYPE_HIGH, "()Ljava/lang/Object;", "", "g", "", "hasNext", StatisticManager.NEXT, "value", c.a, "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "Lsk9;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "a", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "Ljava/util/Iterator;", "nextIterator", DateTokenConverter.CONVERTER_KEY, "Lcv1;", "getNextStep", "()Lcv1;", "i", "(Lcv1;)V", "nextStep", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: wba  reason: default package */
/* loaded from: classes3.dex */
final class wba<T> extends xba<T> implements Iterator<T>, cv1<Unit>, be5 {
    private int a;
    private T b;
    private Iterator<? extends T> c;
    private cv1<? super Unit> d;

    private final Throwable g() {
        int i = this.a;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.xba
    public Object c(T t, cv1<? super Unit> cv1Var) {
        Object d;
        Object d2;
        Object d3;
        this.b = t;
        this.a = 3;
        this.d = cv1Var;
        d = c75.d();
        d2 = c75.d();
        if (d == d2) {
            io2.c(cv1Var);
        }
        d3 = c75.d();
        if (d == d3) {
            return d;
        }
        return Unit.a;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return e.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.c;
                z65.e(it);
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            cv1<? super Unit> cv1Var = this.d;
            z65.e(cv1Var);
            this.d = null;
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(Unit.a));
        }
    }

    public final void i(cv1<? super Unit> cv1Var) {
        this.d = cv1Var;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.a;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.a = 0;
                    T t = this.b;
                    this.b = null;
                    return t;
                }
                throw g();
            }
            this.a = 1;
            Iterator<? extends T> it = this.c;
            z65.e(it);
            return it.next();
        }
        return h();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        vk9.b(obj);
        this.a = 4;
    }
}
