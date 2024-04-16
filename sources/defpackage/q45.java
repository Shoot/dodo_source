package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u001b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\b\u001a\u00060\u0003R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lq45;", "Lsm6$b;", "Lu45;", "Lq45$a;", DateTokenConverter.CONVERTER_KEY, "Lq45$a;", "o", "()Lq45$a;", "end", "Lkotlin/Function1;", "Lt45;", "", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: q45  reason: default package */
/* loaded from: classes.dex */
public final class q45 extends u45 implements sm6.b {
    private final a d;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq45$a;", "Lsm6$b;", "<init>", "(Lq45;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: q45$a */
    /* loaded from: classes.dex */
    public final class a implements sm6.b {
        public a() {
        }

        @Override // defpackage.sm6
        public /* synthetic */ sm6 f(sm6 sm6Var) {
            return rm6.a(this, sm6Var);
        }

        @Override // defpackage.sm6
        public /* synthetic */ Object h(Object obj, Function2 function2) {
            return tm6.b(this, obj, function2);
        }

        @Override // defpackage.sm6
        public /* synthetic */ boolean i(Function1 function1) {
            return tm6.a(this, function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q45(Function1<? super t45, Unit> function1) {
        super(function1);
        z65.h(function1, "inspectorInfo");
        this.d = new a();
    }

    @Override // defpackage.sm6
    public /* synthetic */ sm6 f(sm6 sm6Var) {
        return rm6.a(this, sm6Var);
    }

    @Override // defpackage.sm6
    public /* synthetic */ Object h(Object obj, Function2 function2) {
        return tm6.b(this, obj, function2);
    }

    @Override // defpackage.sm6
    public /* synthetic */ boolean i(Function1 function1) {
        return tm6.a(this, function1);
    }

    public final a o() {
        return this.d;
    }
}
