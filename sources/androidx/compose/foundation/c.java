package androidx.compose.foundation;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lsm6;", "Luc1;", RemoteMessageConst.Notification.COLOR, "Ltga;", "shape", "a", "(Lsm6;JLtga;)Lsm6;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt45;", "", "a", "(Lt45;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<t45, Unit> {
        final /* synthetic */ long a;
        final /* synthetic */ tga b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, tga tgaVar) {
            super(1);
            this.a = j;
            this.b = tgaVar;
        }

        public final void a(t45 t45Var) {
            z65.h(t45Var, "$this$null");
            t45Var.b("background");
            t45Var.c(uc1.f(this.a));
            t45Var.a().b(RemoteMessageConst.Notification.COLOR, uc1.f(this.a));
            t45Var.a().b("shape", this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t45 t45Var) {
            a(t45Var);
            return Unit.a;
        }
    }

    public static final sm6 a(sm6 sm6Var, long j, tga tgaVar) {
        Function1 a2;
        z65.h(sm6Var, "$this$background");
        z65.h(tgaVar, "shape");
        if (r45.c()) {
            a2 = new a(j, tgaVar);
        } else {
            a2 = r45.a();
        }
        return sm6Var.f(new BackgroundElement(j, null, 1.0f, tgaVar, a2, 2, null));
    }

    public static /* synthetic */ sm6 b(sm6 sm6Var, long j, tga tgaVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tgaVar = s99.a();
        }
        return a(sm6Var, j, tgaVar);
    }
}
