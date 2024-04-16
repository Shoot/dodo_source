package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.lx1;
import defpackage.wob;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\fB\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lg34;", "", "Luob;", "typefaceRequest", "Lac8;", "platformFontLoader", "Lkotlin/Function1;", "Lwob$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Lwob;", "a", "Lly;", "Lly;", "asyncTypefaceCache", "Lqx1;", "b", "Lqx1;", "asyncLoadScope", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Lly;Lkotlin/coroutines/CoroutineContext;)V", com.huawei.hms.opendevice.c.a, "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: g34  reason: default package */
/* loaded from: classes.dex */
public final class g34 {
    public static final a c = new a(null);
    private static final j34 d = new j34();
    private static final lx1 e = new c(lx1.J);
    private final ly a;
    private qx1 b;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg34$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: g34$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: g34$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ gy b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gy gyVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = gyVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                gy gyVar = this.b;
                this.a = 1;
                if (gyVar.j(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public g34(ly lyVar, CoroutineContext coroutineContext) {
        z65.h(lyVar, "asyncTypefaceCache");
        z65.h(coroutineContext, "injectedContext");
        this.a = lyVar;
        this.b = rx1.a(e.P(coroutineContext).P(k2b.a((l95) coroutineContext.c(l95.M))));
    }

    public wob a(uob uobVar, ac8 ac8Var, Function1<? super wob.b, Unit> function1, Function1<? super uob, ? extends Object> function12) {
        Pair b2;
        z65.h(uobVar, "typefaceRequest");
        z65.h(ac8Var, "platformFontLoader");
        z65.h(function1, "onAsyncCompletion");
        z65.h(function12, "createDefaultTypeface");
        if (uobVar.c() instanceof f34) {
            b2 = h34.b(d.a(((f34) uobVar.c()).v(), uobVar.f(), uobVar.d()), uobVar, this.a, ac8Var, function12);
            List list = (List) b2.a();
            Object b3 = b2.b();
            if (list == null) {
                return new wob.b(b3, false, 2, null);
            }
            gy gyVar = new gy(list, b3, uobVar, this.a, function1, ac8Var);
            sh0.d(this.b, null, ux1.UNDISPATCHED, new b(gyVar, null), 1, null);
            return new wob.a(gyVar);
        }
        return null;
    }

    public /* synthetic */ g34(ly lyVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ly() : lyVar, (i & 2) != 0 ? e.a : coroutineContext);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"g34$c", "Lkotlin/coroutines/a;", "Llx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: g34$c */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.a implements lx1 {
        public c(lx1.a aVar) {
            super(aVar);
        }

        @Override // defpackage.lx1
        public void N(CoroutineContext coroutineContext, Throwable th) {
        }
    }
}
