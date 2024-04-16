package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.lw5;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lba1;", "E", "Lkba;", "Lb99;", "Llw5$c;", "otherOp", "Lr3b;", "U", "", "R", "value", "l", "(Ljava/lang/Object;Llw5$c;)Lr3b;", "i", "(Ljava/lang/Object;)V", "closed", "T", "", "toString", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Throwable;", "closeCause", "a0", "()Ljava/lang/Throwable;", "sendException", "Z", "receiveException", "X", "()Lba1;", "offerResult", "Y", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ba1  reason: default package */
/* loaded from: classes3.dex */
public final class ba1<E> extends kba implements b99<E> {
    public final Throwable d;

    public ba1(Throwable th) {
        this.d = th;
    }

    @Override // defpackage.kba
    public r3b U(lw5.c cVar) {
        r3b r3bVar = hn0.a;
        if (cVar != null) {
            cVar.d();
        }
        return r3bVar;
    }

    public final Throwable Z() {
        Throwable th = this.d;
        if (th == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return th;
    }

    public final Throwable a0() {
        Throwable th = this.d;
        if (th == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return th;
    }

    @Override // defpackage.b99
    public r3b l(E e, lw5.c cVar) {
        r3b r3bVar = hn0.a;
        if (cVar != null) {
            cVar.d();
        }
        return r3bVar;
    }

    @Override // defpackage.lw5
    public String toString() {
        return "Closed@" + jo2.b(this) + '[' + this.d + ']';
    }

    @Override // defpackage.kba
    public void R() {
    }

    @Override // defpackage.b99
    /* renamed from: X */
    public ba1<E> c() {
        return this;
    }

    @Override // defpackage.kba
    /* renamed from: Y */
    public ba1<E> S() {
        return this;
    }

    @Override // defpackage.kba
    public void T(ba1<?> ba1Var) {
    }

    @Override // defpackage.b99
    public void i(E e) {
    }
}
