package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: InteractionSource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lpq6;", "Loq6;", "Lh65;", "interaction", "", "a", "(Lh65;Lcv1;)Ljava/lang/Object;", "", c.a, "Lcr6;", "Lcr6;", DateTokenConverter.CONVERTER_KEY, "()Lcr6;", "interactions", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pq6  reason: default package */
/* loaded from: classes.dex */
final class pq6 implements oq6 {
    private final cr6<h65> a = uha.b(0, 16, zg0.DROP_OLDEST, 1, null);

    @Override // defpackage.oq6
    public Object a(h65 h65Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object emit = b().emit(h65Var, cv1Var);
        d = c75.d();
        if (emit == d) {
            return emit;
        }
        return Unit.a;
    }

    @Override // defpackage.oq6
    public boolean c(h65 h65Var) {
        z65.h(h65Var, "interaction");
        return b().a(h65Var);
    }

    @Override // defpackage.i65
    /* renamed from: d */
    public cr6<h65> b() {
        return this.a;
    }
}
