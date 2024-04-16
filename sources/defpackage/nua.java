package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sk9;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lnua;", "Li2;", "Llua;", "flow", "", c.a, "(Llua;)Z", "", "Lcv1;", "", e.a, "(Llua;)[Lcv1;", "f", "()V", "g", "()Z", DateTokenConverter.CONVERTER_KEY, "(Lcv1;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: nua  reason: default package */
/* loaded from: classes3.dex */
public final class nua extends i2<lua<?>> {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(nua.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // defpackage.i2
    /* renamed from: c */
    public boolean a(lua<?> luaVar) {
        r3b r3bVar;
        if (this._state == null) {
            r3bVar = mua.a;
            this._state = r3bVar;
            return true;
        }
        return false;
    }

    public final Object d(cv1<? super Unit> cv1Var) {
        cv1 c;
        r3b r3bVar;
        Object d;
        Object d2;
        c = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c, 1);
        gn0Var.w();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        r3bVar = mua.a;
        if (!d2.a(atomicReferenceFieldUpdater, this, r3bVar, gn0Var)) {
            sk9.a aVar = sk9.b;
            gn0Var.resumeWith(sk9.b(Unit.a));
        }
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        d2 = c75.d();
        if (s == d2) {
            return s;
        }
        return Unit.a;
    }

    @Override // defpackage.i2
    /* renamed from: e */
    public cv1<Unit>[] b(lua<?> luaVar) {
        this._state = null;
        return h2.a;
    }

    public final void f() {
        r3b r3bVar;
        r3b r3bVar2;
        r3b r3bVar3;
        r3b r3bVar4;
        while (true) {
            Object obj = this._state;
            if (obj != null) {
                r3bVar = mua.b;
                if (obj != r3bVar) {
                    r3bVar2 = mua.a;
                    if (obj == r3bVar2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                        r3bVar3 = mua.b;
                        if (d2.a(atomicReferenceFieldUpdater, this, obj, r3bVar3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                        r3bVar4 = mua.a;
                        if (d2.a(atomicReferenceFieldUpdater2, this, obj, r3bVar4)) {
                            sk9.a aVar = sk9.b;
                            ((gn0) obj).resumeWith(sk9.b(Unit.a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        r3b r3bVar;
        r3b r3bVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        r3bVar = mua.a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, r3bVar);
        z65.e(andSet);
        r3bVar2 = mua.b;
        if (andSet == r3bVar2) {
            return true;
        }
        return false;
    }
}
