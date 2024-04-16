package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.e2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: LinkedListChannel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lqq5;", "E", "La1;", "element", "", "A", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lc35;", "Lkba;", StatisticManager.LIST, "Lba1;", "closed", "", "T", "(Ljava/lang/Object;Lba1;)V", "", "O", "()Z", "isBufferAlwaysEmpty", "P", "isBufferEmpty", "x", "isBufferAlwaysFull", "y", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: qq5  reason: default package */
/* loaded from: classes3.dex */
public class qq5<E> extends a1<E> {
    public qq5(Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.e2
    public Object A(E e) {
        b99<?> C;
        do {
            Object A = super.A(e);
            r3b r3bVar = b1.b;
            if (A == r3bVar) {
                return r3bVar;
            }
            if (A == b1.c) {
                C = C(e);
                if (C == null) {
                    return r3bVar;
                }
            } else if (A instanceof ba1) {
                return A;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + A).toString());
            }
        } while (!(C instanceof ba1));
        return C;
    }

    @Override // defpackage.a1
    protected final boolean O() {
        return true;
    }

    @Override // defpackage.a1
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.a1
    protected void T(Object obj, ba1<?> ba1Var) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                kba kbaVar = (kba) obj;
                if (kbaVar instanceof e2.a) {
                    Function1<E, Unit> function1 = this.a;
                    if (function1 != null) {
                        undeliveredElementException = g97.c(function1, ((e2.a) kbaVar).d, null);
                    }
                } else {
                    kbaVar.T(ba1Var);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    kba kbaVar2 = (kba) arrayList.get(size);
                    if (kbaVar2 instanceof e2.a) {
                        Function1<E, Unit> function12 = this.a;
                        if (function12 != null) {
                            undeliveredElementException2 = g97.c(function12, ((e2.a) kbaVar2).d, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        kbaVar2.T(ba1Var);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException == null) {
            return;
        }
        throw undeliveredElementException;
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
