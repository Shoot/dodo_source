package defpackage;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.f63;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: DodoRouter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f2\u0006\u0010\b\u001a\u00020\u0007J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000ej\u0002`\u000fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tRH\u0010\u0018\u001a6\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000ej\u0002`\u000f0\u0014j\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000ej\u0002`\u000f`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lf63;", "Lxo9;", "Lyw9;", "screen", "", Image.TYPE_HIGH, "n", "", "resultCode", "", "result", "i", "Loz3;", "k", "Lwk9;", "Lru/dodopizza/app/infrastracture/navigation/ResultListener;", "listener", Image.TYPE_MEDIUM, "j", "l", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", c.a, "Ljava/util/HashMap;", "resultListeners", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f63  reason: default package */
/* loaded from: classes4.dex */
public final class f63 extends xo9 {
    private final HashMap<Integer, wk9<Object>> c = new HashMap<>();

    /* compiled from: DodoRouter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Ldl8;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.navigation.DodoRouter$resultsFlow$1", f = "DodoRouter.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: f63$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<dl8<? super Object>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DodoRouter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: f63$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0310a extends ej5 implements Function0<Unit> {
            final /* synthetic */ f63 a;
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0310a(f63 f63Var, int i) {
                super(0);
                this.a = f63Var;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.j(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(dl8 dl8Var, Object obj) {
            dw0.c(dl8Var, obj);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.d, cv1Var);
            aVar.b = obj;
            return aVar;
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
                final dl8 dl8Var = (dl8) this.b;
                f63.this.m(this.d, new wk9() { // from class: e63
                    @Override // defpackage.wk9
                    public final void onResult(Object obj2) {
                        f63.a.k(dl8.this, obj2);
                    }
                });
                C0310a c0310a = new C0310a(f63.this, this.d);
                this.a = 1;
                if (bl8.a(dl8Var, c0310a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: j */
        public final Object invoke(dl8<Object> dl8Var, cv1<? super Unit> cv1Var) {
            return ((a) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
        }
    }

    public final void h(yw9 yw9Var) {
        z65.h(yw9Var, "screen");
        super.a(new u6(yw9Var));
    }

    public final void i(int i, Object obj) {
        super.d();
        l(i, obj);
    }

    public final void j(int i) {
        this.c.remove(Integer.valueOf(i));
    }

    public final oz3<Object> k(int i) {
        return wz3.g(new a(i, null));
    }

    public final void l(int i, Object obj) {
        wk9<Object> wk9Var = this.c.get(Integer.valueOf(i));
        if (wk9Var != null) {
            wk9Var.onResult(obj);
        }
    }

    public final void m(int i, wk9<Object> wk9Var) {
        z65.h(wk9Var, "listener");
        this.c.put(Integer.valueOf(i), wk9Var);
    }

    public final void n(yw9 yw9Var) {
        z65.h(yw9Var, "screen");
        super.a(new yja(yw9Var));
    }
}
