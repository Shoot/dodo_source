package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: RendezvousChannel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lfg9;", "E", "La1;", "", "O", "()Z", "isBufferAlwaysEmpty", "P", "isBufferEmpty", "x", "isBufferAlwaysFull", "y", "isBufferFull", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: fg9  reason: default package */
/* loaded from: classes3.dex */
public class fg9<E> extends a1<E> {
    public fg9(Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // defpackage.a1
    protected final boolean O() {
        return true;
    }

    @Override // defpackage.a1
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.e2
    protected final boolean x() {
        return true;
    }

    @Override // defpackage.e2
    protected final boolean y() {
        return true;
    }
}
