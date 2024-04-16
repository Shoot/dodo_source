package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.lw5;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lmba;", "E", "Lkba;", "Llw5$c;", "otherOp", "Lr3b;", "U", "", "R", "Lba1;", "closed", "T", "", "toString", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "S", "()Ljava/lang/Object;", "pollResult", "Lfn0;", e.a, "Lfn0;", "cont", "<init>", "(Ljava/lang/Object;Lfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: mba  reason: default package */
/* loaded from: classes3.dex */
public class mba<E> extends kba {
    private final E d;
    public final fn0<Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public mba(E e, fn0<? super Unit> fn0Var) {
        this.d = e;
        this.e = fn0Var;
    }

    @Override // defpackage.kba
    public void R() {
        this.e.x0(hn0.a);
    }

    @Override // defpackage.kba
    public E S() {
        return this.d;
    }

    @Override // defpackage.kba
    public void T(ba1<?> ba1Var) {
        fn0<Unit> fn0Var = this.e;
        sk9.a aVar = sk9.b;
        fn0Var.resumeWith(sk9.b(vk9.a(ba1Var.a0())));
    }

    @Override // defpackage.kba
    public r3b U(lw5.c cVar) {
        lw5.a aVar;
        fn0<Unit> fn0Var = this.e;
        Unit unit = Unit.a;
        if (cVar != null) {
            aVar = cVar.c;
        } else {
            aVar = null;
        }
        if (fn0Var.m(unit, aVar) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.d();
        }
        return hn0.a;
    }

    @Override // defpackage.lw5
    public String toString() {
        return jo2.a(this) + '@' + jo2.b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + S() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
