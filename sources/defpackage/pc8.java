package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: PlatformTextInputAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\u0010\tB%\u0012\u001c\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u00000\u0006R\u00020\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007R*\u0010\u000e\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR,\u0010\u0012\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0002\b\u00030\u0006R\u00020\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u001c"}, d2 = {"Lpc8;", "Loc8;", "Lmc8;", "T", "Lnc8;", "plugin", "Lpc8$c;", DateTokenConverter.CONVERTER_KEY, "Lpc8$a;", com.huawei.hms.opendevice.c.a, "Lkotlin/Function2;", "Llc8;", "a", "Lkotlin/jvm/functions/Function2;", "factory", "Lupa;", "b", "Lupa;", "adaptersByPlugin", "", "Z", "adaptersMayNeedDisposal", "Lnc8;", "focusedPlugin", "()Lmc8;", "focusedAdapter", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pc8  reason: default package */
/* loaded from: classes.dex */
public final class pc8 implements oc8 {
    private final Function2<nc8<?>, lc8, mc8> a;
    private final upa<nc8<?>, c<?>> b;
    private boolean c;
    private nc8<?> d;

    /* compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lpc8$a;", "Lmc8;", "T", "", "a", "Lmc8;", "()Lmc8;", "adapter", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "onDispose", "<init>", "(Lmc8;Lkotlin/jvm/functions/Function0;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: pc8$a */
    /* loaded from: classes.dex */
    public static final class a<T extends mc8> {
        private final T a;
        private final Function0<Boolean> b;

        public a(T t, Function0<Boolean> function0) {
            z65.h(t, "adapter");
            z65.h(function0, "onDispose");
            this.a = t;
            this.b = function0;
        }

        public final T a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lpc8$b;", "Llc8;", "Lnc8;", "a", "Lnc8;", "plugin", "<init>", "(Lpc8;Lnc8;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: pc8$b */
    /* loaded from: classes.dex */
    public final class b implements lc8 {
        private final nc8<?> a;
        final /* synthetic */ pc8 b;

        public b(pc8 pc8Var, nc8<?> nc8Var) {
            z65.h(nc8Var, "plugin");
            this.b = pc8Var;
            this.a = nc8Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR+\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lpc8$c;", "Lmc8;", "T", "", "", DateTokenConverter.CONVERTER_KEY, "", "a", "Lmc8;", "b", "()Lmc8;", "adapter", "", "<set-?>", "Lnq6;", com.huawei.hms.opendevice.c.a, "()I", e.a, "(I)V", "refCount", "<init>", "(Lpc8;Lmc8;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: pc8$c */
    /* loaded from: classes.dex */
    public final class c<T extends mc8> {
        private final T a;
        private final nq6 b;
        final /* synthetic */ pc8 c;

        public c(pc8 pc8Var, T t) {
            z65.h(t, "adapter");
            this.c = pc8Var;
            this.a = t;
            this.b = dpa.a(0);
        }

        private final int c() {
            return this.b.b();
        }

        private final void e(int i) {
            this.b.e(i);
        }

        public final boolean a() {
            e(c() - 1);
            if (c() >= 0) {
                if (c() == 0) {
                    this.c.c = true;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + c() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }

        public final T b() {
            return this.a;
        }

        public final void d() {
            e(c() + 1);
        }
    }

    /* compiled from: PlatformTextInputAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmc8;", "T", "", "invoke", "()Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pc8$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Boolean> {
        final /* synthetic */ c<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c<T> cVar) {
            super(0);
            this.a = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pc8(Function2<? super nc8<?>, ? super lc8, ? extends mc8> function2) {
        z65.h(function2, "factory");
        this.a = function2;
        this.b = qpa.c();
    }

    private final <T extends mc8> c<T> d(nc8<T> nc8Var) {
        mc8 invoke = this.a.invoke(nc8Var, new b(this, nc8Var));
        z65.f(invoke, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
        c<T> cVar = new c<>(this, invoke);
        this.b.put(nc8Var, cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [mc8] */
    public final mc8 b() {
        c<?> cVar = this.b.get(this.d);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final <T extends mc8> a<T> c(nc8<T> nc8Var) {
        z65.h(nc8Var, "plugin");
        c<?> cVar = this.b.get(nc8Var);
        if (cVar == null) {
            cVar = d(nc8Var);
        }
        cVar.d();
        return new a<>(cVar.b(), new d(cVar));
    }
}
