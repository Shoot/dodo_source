package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0004H'J\b\u0010\b\u001a\u00020\u0004H'J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH'J\b\u0010\f\u001a\u00020\u0004H'J\b\u0010\r\u001a\u00020\u0004H'J\b\u0010\u000e\u001a\u00020\u0004H'J\u001c\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H'J\b\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0014\u001a\u00020\u0004H'J=\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u000f2\u0006\u0010\u0016\u001a\u00028\u00002\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H'J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H'J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001dH\u0017J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0002H\u0017J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020!H\u0017J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020#H\u0017J\u0012\u0010%\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0017J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H'J\u0016\u0010*\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H'J#\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000+H'¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\u00042\u0012\u00100\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030/0.H'¢\u0006\u0004\b1\u00102J\b\u00103\u001a\u00020\u0004H'J\b\u00104\u001a\u00020\u0004H&J\b\u00106\u001a\u000205H'R\u001e\u0010<\u001a\u0006\u0012\u0002\b\u0003078&X§\u0004¢\u0006\f\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b?\u0010;\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010>R\u001a\u0010F\u001a\u00020\u001d8&X§\u0004¢\u0006\f\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010>R\u001c\u0010J\u001a\u0004\u0018\u00010&8&X§\u0004¢\u0006\f\u0012\u0004\bI\u0010;\u001a\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bM\u0010;\u001a\u0004\bK\u0010LR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020W8fX§\u0004¢\u0006\f\u0012\u0004\bZ\u0010;\u001a\u0004\bX\u0010Y\u0082\u0001\u0001\\ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006]À\u0006\u0001"}, d2 = {"Lqn1;", "", "", Action.KEY_ATTRIBUTE, "", "w", "J", "A", Image.TYPE_SMALL, "f", "Lxw9;", "i", "E", "j", "B", "T", "Lkotlin/Function0;", "factory", "D", "o", "r", "V", "value", "Lkotlin/Function2;", "block", "l", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "x", "p", "", "K", "a", c.a, "", "b", "", DateTokenConverter.CONVERTER_KEY, "z", "Ld99;", Action.SCOPE_ATTRIBUTE, "C", "effect", "t", "Llo1;", "k", "(Llo1;)Ljava/lang/Object;", "", "Lzr8;", "values", "q", "([Lzr8;)V", "F", "u", "Ldo1;", "I", "Lwp;", Image.TYPE_HIGH, "()Lwp;", "getApplier$annotations", "()V", "applier", e.a, "()Z", "getInserting$annotations", "inserting", "g", "getSkipping$annotations", "skipping", "G", "getDefaultsInvalid$annotations", "defaultsInvalid", "v", "()Ld99;", "getRecomposeScope$annotations", "recomposeScope", "H", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Lpo1;", "n", "()Lpo1;", "currentCompositionLocalMap", "Lfo1;", "y", "()Lfo1;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", Image.TYPE_MEDIUM, "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Lsn1;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qn1  reason: default package */
/* loaded from: classes.dex */
public interface qn1 {
    public static final a a = a.a;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lqn1$a;", "", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: qn1$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final Object b = new C0489a();

        /* compiled from: Composer.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"qn1$a$a", "", "", "toString", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: qn1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0489a {
            C0489a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private a() {
        }

        public final Object a() {
            return b;
        }
    }

    void A();

    void B();

    void C(d99 d99Var);

    <T> void D(Function0<? extends T> function0);

    void E();

    void F();

    boolean G();

    int H();

    do1 I();

    void J();

    boolean K(Object obj);

    boolean a(boolean z);

    boolean b(float f);

    boolean c(int i);

    boolean d(long j);

    boolean e();

    qn1 f(int i);

    boolean g();

    wp<?> h();

    xw9 i();

    void j();

    <T> T k(lo1<T> lo1Var);

    <V, T> void l(V v, Function2<? super T, ? super V, Unit> function2);

    CoroutineContext m();

    po1 n();

    void o();

    void p(Object obj);

    void q(zr8<?>[] zr8VarArr);

    void r();

    void s();

    void t(Function0<Unit> function0);

    void u();

    d99 v();

    void w(int i);

    Object x();

    fo1 y();

    boolean z(Object obj);
}
