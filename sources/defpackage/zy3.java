package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import defpackage.yy3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FlashLight.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lyy3$a;", "", "builder", "a", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: zy3  reason: default package */
/* loaded from: classes.dex */
public final class zy3 {

    /* compiled from: FlashLight.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zy3$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ yy3 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yy3 yy3Var) {
            super(1);
            this.a = yy3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.a.j();
        }
    }

    public static final Object a(Context context, Function1<? super yy3.a, Unit> function1, cv1<? super Unit> cv1Var) {
        cv1 c;
        Object d;
        Object d2;
        c = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c, 1);
        gn0Var.w();
        yy3.a aVar = new yy3.a(context);
        function1.invoke(aVar);
        yy3 a2 = aVar.a();
        a2.n();
        gn0Var.u(new a(a2));
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
}
