package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PersonalPriceTimer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lv18;", "Lt18;", "", "timeRemain", "Lkotlin/Function1;", "", "onTick", "Lkotlin/Function0;", "onFinish", "a", "release", "Lt53;", "Lt53;", "countDownTimer", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v18  reason: default package */
/* loaded from: classes2.dex */
public final class v18 implements t18 {
    private t53 a;

    /* compiled from: PersonalPriceTimer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v18$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Unit> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    @Override // defpackage.t18
    public void a(long j, Function1<? super Long, Unit> function1, Function0<Unit> function0) {
        z65.h(function1, "onTick");
        z65.h(function0, "onFinish");
        if (this.a == null) {
            this.a = new t53();
        }
        t53 t53Var = this.a;
        if (t53Var != null) {
            t53Var.c();
        }
        t53 t53Var2 = this.a;
        if (t53Var2 != null) {
            t53Var2.d(j, TimeUnit.SECONDS.toMillis(1L), function1, function0, a.a);
        }
    }

    @Override // defpackage.t18
    public void release() {
        t53 t53Var = this.a;
        if (t53Var != null) {
            t53Var.c();
        }
    }
}
