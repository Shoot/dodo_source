package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
/* compiled from: PizzaConceptService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lf78;", "Le78;", "Lb78;", DateTokenConverter.CONVERTER_KEY, "a", "Lhq3;", "Lhq3;", "featureService", "b", "Lrn5;", c.a, "()Lb78;", "pizzaConcept", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f78  reason: default package */
/* loaded from: classes4.dex */
public final class f78 implements e78 {
    private final hq3 a;
    private final rn5 b;

    /* compiled from: PizzaConceptService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb78;", "a", "()Lb78;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f78$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<b78> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final b78 invoke() {
            return f78.this.d();
        }
    }

    public f78(hq3 hq3Var) {
        rn5 b;
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
        b = yn5.b(new a());
        this.b = b;
    }

    private final b78 c() {
        return (b78) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b78 d() {
        boolean a2 = this.a.a(bq3.l);
        if (a2) {
            return b78.b;
        }
        if (!a2) {
            return b78.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.e78
    public b78 a() {
        return c();
    }
}
