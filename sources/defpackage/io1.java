package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B*\u0012\u0006\u0010N\u001a\u00020L\u0012\n\u0010P\u001a\u0006\u0012\u0002\b\u00030\u0015\u0012\u000b\b\u0002\u0010\u0086\u0001\u001a\u0004\u0018\u00010x¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002JD\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b*\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001e\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J6\u0010\u001a\u001a\u00020\u00032,\u0010\u0019\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0014j\u0002`\u00180\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u001a\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002J\"\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010$0#H\u0002J\u001d\u0010(\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b*\u0010)J\b\u0010+\u001a\u00020\u0003H\u0016J\u0016\u0010,\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\u0016\u0010-\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016J\u0016\u0010/\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016J\u0010\u00100\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u00101\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u00102\u001a\u00020\u000bH\u0016J$\u00107\u001a\u00020\u00032\u001a\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u0001050403H\u0016J\u0010\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u000208H\u0016J\b\u0010;\u001a\u00020\u0003H\u0016J\b\u0010<\u001a\u00020\u0003H\u0016J\b\u0010=\u001a\u00020\u0003H\u0016J\b\u0010>\u001a\u00020\u0003H\u0016J5\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010?2\b\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020A2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010F\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u001f\u0010G\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u00020\u00032\n\u00109\u001a\u0006\u0012\u0002\b\u00030IH\u0000¢\u0006\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010MR\u0018\u0010P\u001a\u0006\u0012\u0002\b\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010OR(\u0010T\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0Qj\n\u0012\u0006\u0012\u0004\u0018\u00010\t`R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010SR\u0014\u0010V\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010UR$\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020W0\u0006j\b\u0012\u0004\u0012\u00020W`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010XR\u001a\u0010^\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010`R$\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010XR\u001e\u0010d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030I0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0014j\u0002`\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010eR:\u0010f\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0014j\u0002`\u00180\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010`R*\u0010i\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010hR\"\u0010o\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010pR\u0016\u0010t\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010vR\u0016\u0010z\u001a\u0004\u0018\u00010x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010yR\u0017\u0010{\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010j\u001a\u0004\b{\u0010lR\u0016\u0010|\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010jR*\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u001b\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010)R\u0016\u0010\u0083\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010lR\u0015\u0010\u0084\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010lR\u0015\u0010\u0085\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010l¨\u0006\u0089\u0001"}, d2 = {"Lio1;", "Ljv1;", "Lg99;", "", "z", "A", "Ljava/util/HashSet;", "Le99;", "Lkotlin/collections/HashSet;", "", "value", "", "forgetConditionalScopes", "v", "", "values", "w", "y", "D", "", "Lkotlin/Function3;", "Lwp;", "Lzna;", "Lwc9;", "Landroidx/compose/runtime/Change;", "changes", "x", "u", Action.SCOPE_ATTRIBUTE, "instance", "H", "Lrd;", "anchor", "Lj75;", "C", "Lkt4;", "Llt4;", "G", "Lkotlin/Function0;", RemoteMessageConst.Notification.CONTENT, "j", "(Lkotlin/jvm/functions/Function2;)V", c.a, "a", "n", "l", "block", Image.TYPE_MEDIUM, "b", "q", "k", "", "Lkotlin/Pair;", "Lhp6;", "references", "g", "Lgp6;", "state", Image.TYPE_HIGH, "o", e.a, "r", "t", "R", RemoteMessageConst.TO, "", "groupIndex", "f", "(Ljv1;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, Image.TYPE_SMALL, "F", "(Ljava/lang/Object;Le99;)V", "Lt03;", "E", "(Lt03;)V", "Ldo1;", "Ldo1;", "parent", "Lwp;", "applier", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "Lxc9;", "Ljava/util/HashSet;", "abandonSet", "Lwna;", "Lwna;", "getSlotTable$runtime_release", "()Lwna;", "slotTable", "Lmt4;", "Lmt4;", "observations", "conditionallyInvalidatedScopes", "i", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "Lkt4;", "invalidations", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingInvalidScopes", "Lio1;", "invalidationDelegate", "p", "I", "invalidationDelegateGroup", "Lsn1;", "Lsn1;", "composer", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "isRoot", "disposed", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "B", "areChildrenComposing", "isComposing", "isDisposed", "recomposeContext", "<init>", "(Ldo1;Lwp;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: io1  reason: default package */
/* loaded from: classes.dex */
public final class io1 implements jv1, g99 {
    private final do1 a;
    private final wp<?> b;
    private final AtomicReference<Object> c;
    private final Object d;
    private final HashSet<xc9> e;
    private final wna f;
    private final mt4<e99> g;
    private final HashSet<e99> h;
    private final mt4<t03<?>> i;
    private final List<y84<wp<?>, zna, wc9, Unit>> j;
    private final List<y84<wp<?>, zna, wc9, Unit>> k;
    private final mt4<e99> l;
    private kt4<e99, lt4<Object>> m;
    private boolean n;
    private io1 o;
    private int p;
    private final sn1 q;
    private final CoroutineContext r;
    private final boolean s;
    private boolean t;
    private Function2<? super qn1, ? super Integer, Unit> u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u001b"}, d2 = {"Lio1$a;", "Lwc9;", "Lxc9;", "instance", "", c.a, DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function0;", "effect", "a", "Lkn1;", "b", "f", "g", e.a, "", "Ljava/util/Set;", "abandoning", "", "Ljava/util/List;", "remembering", "forgetting", "sideEffects", "deactivating", "releasing", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: io1$a */
    /* loaded from: classes.dex */
    public static final class a implements wc9 {
        private final Set<xc9> a;
        private final List<xc9> b;
        private final List<xc9> c;
        private final List<Function0<Unit>> d;
        private List<kn1> e;
        private List<kn1> f;

        public a(Set<xc9> set) {
            z65.h(set, "abandoning");
            this.a = set;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Override // defpackage.wc9
        public void a(Function0<Unit> function0) {
            z65.h(function0, "effect");
            this.d.add(function0);
        }

        @Override // defpackage.wc9
        public void b(kn1 kn1Var) {
            z65.h(kn1Var, "instance");
            List list = this.f;
            if (list == null) {
                list = new ArrayList();
                this.f = list;
            }
            list.add(kn1Var);
        }

        @Override // defpackage.wc9
        public void c(xc9 xc9Var) {
            z65.h(xc9Var, "instance");
            int lastIndexOf = this.c.lastIndexOf(xc9Var);
            if (lastIndexOf >= 0) {
                this.c.remove(lastIndexOf);
                this.a.remove(xc9Var);
                return;
            }
            this.b.add(xc9Var);
        }

        @Override // defpackage.wc9
        public void d(xc9 xc9Var) {
            z65.h(xc9Var, "instance");
            int lastIndexOf = this.b.lastIndexOf(xc9Var);
            if (lastIndexOf >= 0) {
                this.b.remove(lastIndexOf);
                this.a.remove(xc9Var);
                return;
            }
            this.c.add(xc9Var);
        }

        public final void e() {
            if (!this.a.isEmpty()) {
                Object a = rjb.a.a("Compose:abandons");
                try {
                    Iterator<xc9> it = this.a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().b();
                    }
                    Unit unit = Unit.a;
                    rjb.a.b(a);
                } catch (Throwable th) {
                    rjb.a.b(a);
                    throw th;
                }
            }
        }

        public final void f() {
            Object a;
            List<kn1> list = this.e;
            List<kn1> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                a = rjb.a.a("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).d();
                    }
                    Unit unit = Unit.a;
                    rjb.a.b(a);
                    list.clear();
                } finally {
                }
            }
            if (!this.c.isEmpty()) {
                a = rjb.a.a("Compose:onForgotten");
                try {
                    for (int size2 = this.c.size() - 1; -1 < size2; size2--) {
                        xc9 xc9Var = this.c.get(size2);
                        if (!this.a.contains(xc9Var)) {
                            xc9Var.c();
                        }
                    }
                    Unit unit2 = Unit.a;
                    rjb.a.b(a);
                } finally {
                }
            }
            if (!this.b.isEmpty()) {
                Object a2 = rjb.a.a("Compose:onRemembered");
                try {
                    List<xc9> list3 = this.b;
                    int size3 = list3.size();
                    for (int i = 0; i < size3; i++) {
                        xc9 xc9Var2 = list3.get(i);
                        this.a.remove(xc9Var2);
                        xc9Var2.a();
                    }
                    Unit unit3 = Unit.a;
                    rjb.a.b(a2);
                } finally {
                    rjb.a.b(a2);
                }
            }
            List<kn1> list4 = this.f;
            List<kn1> list5 = list4;
            if (list5 != null && !list5.isEmpty()) {
                a = rjb.a.a("Compose:releases");
                try {
                    for (int size4 = list4.size() - 1; -1 < size4; size4--) {
                        list4.get(size4).i();
                    }
                    Unit unit4 = Unit.a;
                    rjb.a.b(a);
                    list4.clear();
                } finally {
                    rjb.a.b(a);
                }
            }
        }

        public final void g() {
            if (!this.d.isEmpty()) {
                Object a = rjb.a.a("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.d.clear();
                    Unit unit = Unit.a;
                    rjb.a.b(a);
                } catch (Throwable th) {
                    rjb.a.b(a);
                    throw th;
                }
            }
        }
    }

    public io1(do1 do1Var, wp<?> wpVar, CoroutineContext coroutineContext) {
        z65.h(do1Var, "parent");
        z65.h(wpVar, "applier");
        this.a = do1Var;
        this.b = wpVar;
        this.c = new AtomicReference<>(null);
        this.d = new Object();
        HashSet<xc9> hashSet = new HashSet<>();
        this.e = hashSet;
        wna wnaVar = new wna();
        this.f = wnaVar;
        this.g = new mt4<>();
        this.h = new HashSet<>();
        this.i = new mt4<>();
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.k = arrayList2;
        this.l = new mt4<>();
        this.m = new kt4<>(0, 1, null);
        sn1 sn1Var = new sn1(wpVar, do1Var, wnaVar, hashSet, arrayList, arrayList2, this);
        do1Var.m(sn1Var);
        this.q = sn1Var;
        this.r = coroutineContext;
        this.s = do1Var instanceof h99;
        this.u = hn1.a.a();
    }

    private final void A() {
        Object andSet = this.c.getAndSet(null);
        if (!z65.c(andSet, jo1.c())) {
            if (andSet instanceof Set) {
                w((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    w(set, false);
                }
            } else if (andSet == null) {
                tn1.w("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            } else {
                tn1.w("corrupt pendingModifications drain: " + this.c);
                throw new KotlinNothingValueException();
            }
        }
    }

    private final boolean B() {
        return this.q.u0();
    }

    private final j75 C(e99 e99Var, rd rdVar, Object obj) {
        synchronized (this.d) {
            try {
                io1 io1Var = this.o;
                if (io1Var == null || !this.f.C(this.p, rdVar)) {
                    io1Var = null;
                }
                if (io1Var == null) {
                    if (H(e99Var, obj)) {
                        return j75.IMMINENT;
                    } else if (obj == null) {
                        this.m.l(e99Var, null);
                    } else {
                        jo1.b(this.m, e99Var, obj);
                    }
                }
                if (io1Var != null) {
                    return io1Var.C(e99Var, rdVar, obj);
                }
                this.a.i(this);
                if (p()) {
                    return j75.DEFERRED;
                }
                return j75.SCHEDULED;
            } finally {
            }
        }
    }

    private final void D(Object obj) {
        int f;
        lt4 o;
        mt4<e99> mt4Var = this.g;
        f = mt4Var.f(obj);
        if (f >= 0) {
            o = mt4Var.o(f);
            Object[] t = o.t();
            int size = o.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = t[i];
                z65.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                e99 e99Var = (e99) obj2;
                if (e99Var.s(obj) == j75.IMMINENT) {
                    this.l.c(obj, e99Var);
                }
            }
        }
    }

    private final kt4<e99, lt4<Object>> G() {
        kt4<e99, lt4<Object>> kt4Var = this.m;
        this.m = new kt4<>(0, 1, null);
        return kt4Var;
    }

    private final boolean H(e99 e99Var, Object obj) {
        if (p() && this.q.C1(e99Var, obj)) {
            return true;
        }
        return false;
    }

    private final void u() {
        this.c.set(null);
        this.j.clear();
        this.k.clear();
        this.e.clear();
    }

    private final HashSet<e99> v(HashSet<e99> hashSet, Object obj, boolean z) {
        int f;
        lt4 o;
        mt4<e99> mt4Var = this.g;
        f = mt4Var.f(obj);
        if (f >= 0) {
            o = mt4Var.o(f);
            Object[] t = o.t();
            int size = o.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = t[i];
                z65.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                e99 e99Var = (e99) obj2;
                if (!this.l.m(obj, e99Var) && e99Var.s(obj) != j75.IGNORED) {
                    if (e99Var.t() && !z) {
                        this.h.add(e99Var);
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                        }
                        hashSet.add(e99Var);
                    }
                }
            }
        }
        return hashSet;
    }

    private final void w(Set<? extends Object> set, boolean z) {
        HashSet<e99> hashSet;
        int f;
        lt4 o;
        int i;
        int f2;
        lt4 o2;
        if (set instanceof lt4) {
            lt4 lt4Var = (lt4) set;
            Object[] t = lt4Var.t();
            int size = lt4Var.size();
            hashSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = t[i2];
                z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj instanceof e99) {
                    ((e99) obj).s(null);
                } else {
                    hashSet = v(hashSet, obj, z);
                    mt4<t03<?>> mt4Var = this.i;
                    f2 = mt4Var.f(obj);
                    if (f2 >= 0) {
                        o2 = mt4Var.o(f2);
                        Object[] t2 = o2.t();
                        int size2 = o2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Object obj2 = t2[i3];
                            z65.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSet = v(hashSet, (t03) obj2, z);
                        }
                    }
                }
            }
        } else {
            hashSet = null;
            for (Object obj3 : set) {
                if (obj3 instanceof e99) {
                    ((e99) obj3).s(null);
                } else {
                    HashSet<e99> v = v(hashSet, obj3, z);
                    mt4<t03<?>> mt4Var2 = this.i;
                    f = mt4Var2.f(obj3);
                    if (f >= 0) {
                        o = mt4Var2.o(f);
                        Object[] t3 = o.t();
                        int size3 = o.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Object obj4 = t3[i4];
                            z65.f(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            v = v(v, (t03) obj4, z);
                        }
                    }
                    hashSet = v;
                }
            }
        }
        if (z && (!this.h.isEmpty())) {
            mt4<e99> mt4Var3 = this.g;
            int[] k = mt4Var3.k();
            lt4<e99>[] i5 = mt4Var3.i();
            Object[] l = mt4Var3.l();
            int j = mt4Var3.j();
            int i6 = 0;
            int i7 = 0;
            while (i6 < j) {
                int i8 = k[i6];
                lt4<e99> lt4Var2 = i5[i8];
                z65.e(lt4Var2);
                Object[] t4 = lt4Var2.t();
                int size4 = lt4Var2.size();
                int i9 = 0;
                int i10 = 0;
                while (i9 < size4) {
                    Object obj5 = t4[i9];
                    z65.f(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    lt4<e99>[] lt4VarArr = i5;
                    e99 e99Var = (e99) obj5;
                    int i11 = j;
                    if (!this.h.contains(e99Var)) {
                        if (hashSet != null && hashSet.contains(e99Var)) {
                            i = i10;
                        }
                        int i12 = i10;
                        if (i12 != i9) {
                            t4[i12] = obj5;
                        }
                        i10 = i12 + 1;
                        i9++;
                        i5 = lt4VarArr;
                        j = i11;
                    } else {
                        i = i10;
                    }
                    i10 = i;
                    i9++;
                    i5 = lt4VarArr;
                    j = i11;
                }
                lt4<e99>[] lt4VarArr2 = i5;
                int i13 = j;
                int i14 = i10;
                for (int i15 = i14; i15 < size4; i15++) {
                    t4[i15] = null;
                }
                ((lt4) lt4Var2).a = i14;
                if (lt4Var2.size() > 0) {
                    if (i7 != i6) {
                        int i16 = k[i7];
                        k[i7] = i8;
                        k[i6] = i16;
                    }
                    i7++;
                }
                i6++;
                i5 = lt4VarArr2;
                j = i13;
            }
            int j2 = mt4Var3.j();
            for (int i17 = i7; i17 < j2; i17++) {
                l[k[i17]] = null;
            }
            mt4Var3.p(i7);
            this.h.clear();
            y();
        } else if (hashSet != null) {
            mt4<e99> mt4Var4 = this.g;
            int[] k2 = mt4Var4.k();
            lt4<e99>[] i18 = mt4Var4.i();
            Object[] l2 = mt4Var4.l();
            int j3 = mt4Var4.j();
            int i19 = 0;
            int i20 = 0;
            while (i19 < j3) {
                int i21 = k2[i19];
                lt4<e99> lt4Var3 = i18[i21];
                z65.e(lt4Var3);
                Object[] t5 = lt4Var3.t();
                int size5 = lt4Var3.size();
                int i22 = 0;
                int i23 = 0;
                while (i22 < size5) {
                    Object obj6 = t5[i22];
                    z65.f(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    lt4<e99>[] lt4VarArr3 = i18;
                    if (!hashSet.contains((e99) obj6)) {
                        if (i23 != i22) {
                            t5[i23] = obj6;
                        }
                        i23++;
                    }
                    i22++;
                    i18 = lt4VarArr3;
                }
                lt4<e99>[] lt4VarArr4 = i18;
                for (int i24 = i23; i24 < size5; i24++) {
                    t5[i24] = null;
                }
                ((lt4) lt4Var3).a = i23;
                if (lt4Var3.size() > 0) {
                    if (i20 != i19) {
                        int i25 = k2[i20];
                        k2[i20] = i21;
                        k2[i19] = i25;
                    }
                    i20++;
                }
                i19++;
                i18 = lt4VarArr4;
            }
            int j4 = mt4Var4.j();
            for (int i26 = i20; i26 < j4; i26++) {
                l2[k2[i26]] = null;
            }
            mt4Var4.p(i20);
            y();
        }
    }

    private final void x(List<y84<wp<?>, zna, wc9, Unit>> list) {
        a aVar = new a(this.e);
        try {
            if (list.isEmpty()) {
                if (this.k.isEmpty()) {
                    aVar.e();
                    return;
                }
                return;
            }
            Object a2 = rjb.a.a("Compose:applyChanges");
            this.b.h();
            zna E = this.f.E();
            try {
                wp<?> wpVar = this.b;
                int size = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke(wpVar, E, aVar);
                }
                list.clear();
                Unit unit = Unit.a;
                E.G();
                this.b.e();
                rjb rjbVar = rjb.a;
                rjbVar.b(a2);
                aVar.f();
                aVar.g();
                if (this.n) {
                    Object a3 = rjbVar.a("Compose:unobserve");
                    this.n = false;
                    mt4<e99> mt4Var = this.g;
                    int[] k = mt4Var.k();
                    lt4<e99>[] i3 = mt4Var.i();
                    Object[] l = mt4Var.l();
                    int j = mt4Var.j();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < j) {
                        int i6 = k[i4];
                        lt4<e99> lt4Var = i3[i6];
                        z65.e(lt4Var);
                        Object[] t = lt4Var.t();
                        int size2 = lt4Var.size();
                        int i7 = 0;
                        while (i < size2) {
                            lt4<e99>[] lt4VarArr = i3;
                            Object obj = t[i];
                            int i8 = j;
                            z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(!((e99) obj).r())) {
                                if (i7 != i) {
                                    t[i7] = obj;
                                }
                                i7++;
                            }
                            i++;
                            i3 = lt4VarArr;
                            j = i8;
                        }
                        lt4<e99>[] lt4VarArr2 = i3;
                        int i9 = j;
                        for (int i10 = i7; i10 < size2; i10++) {
                            t[i10] = null;
                        }
                        ((lt4) lt4Var).a = i7;
                        if (lt4Var.size() > 0) {
                            if (i5 != i4) {
                                int i11 = k[i5];
                                k[i5] = i6;
                                k[i4] = i11;
                            }
                            i5++;
                        }
                        i4++;
                        i3 = lt4VarArr2;
                        j = i9;
                        i = 0;
                    }
                    int j2 = mt4Var.j();
                    for (int i12 = i5; i12 < j2; i12++) {
                        l[k[i12]] = null;
                    }
                    mt4Var.p(i5);
                    y();
                    Unit unit2 = Unit.a;
                    rjb.a.b(a3);
                }
                if (this.k.isEmpty()) {
                    aVar.e();
                }
            } finally {
                E.G();
            }
        } finally {
            if (this.k.isEmpty()) {
                aVar.e();
            }
        }
    }

    private final void y() {
        mt4<t03<?>> mt4Var = this.i;
        int[] k = mt4Var.k();
        lt4<t03<?>>[] i = mt4Var.i();
        Object[] l = mt4Var.l();
        int j = mt4Var.j();
        int i2 = 0;
        int i3 = 0;
        while (i2 < j) {
            int i4 = k[i2];
            lt4<t03<?>> lt4Var = i[i4];
            z65.e(lt4Var);
            Object[] t = lt4Var.t();
            int size = lt4Var.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                Object obj = t[i5];
                z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                lt4<t03<?>>[] lt4VarArr = i;
                if (!(!this.g.e((t03) obj))) {
                    if (i6 != i5) {
                        t[i6] = obj;
                    }
                    i6++;
                }
                i5++;
                i = lt4VarArr;
            }
            lt4<t03<?>>[] lt4VarArr2 = i;
            for (int i7 = i6; i7 < size; i7++) {
                t[i7] = null;
            }
            ((lt4) lt4Var).a = i6;
            if (lt4Var.size() > 0) {
                if (i3 != i2) {
                    int i8 = k[i3];
                    k[i3] = i4;
                    k[i2] = i8;
                }
                i3++;
            }
            i2++;
            i = lt4VarArr2;
        }
        int j2 = mt4Var.j();
        for (int i9 = i3; i9 < j2; i9++) {
            l[k[i9]] = null;
        }
        mt4Var.p(i3);
        if (!this.h.isEmpty()) {
            Iterator<e99> it = this.h.iterator();
            z65.g(it, "iterator()");
            while (it.hasNext()) {
                if (!it.next().t()) {
                    it.remove();
                }
            }
        }
    }

    private final void z() {
        Object andSet = this.c.getAndSet(jo1.c());
        if (andSet != null) {
            if (!z65.c(andSet, jo1.c())) {
                if (andSet instanceof Set) {
                    w((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        w(set, true);
                    }
                    return;
                } else {
                    tn1.w("corrupt pendingModifications drain: " + this.c);
                    throw new KotlinNothingValueException();
                }
            }
            tn1.w("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    public final void E(t03<?> t03Var) {
        z65.h(t03Var, "state");
        if (!this.g.e(t03Var)) {
            this.i.n(t03Var);
        }
    }

    public final void F(Object obj, e99 e99Var) {
        z65.h(obj, "instance");
        z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        this.g.m(obj, e99Var);
    }

    @Override // defpackage.co1
    public void a() {
        boolean z;
        synchronized (this.d) {
            try {
                if (!this.t) {
                    this.t = true;
                    this.u = hn1.a.b();
                    List<y84<wp<?>, zna, wc9, Unit>> x0 = this.q.x0();
                    if (x0 != null) {
                        x(x0);
                    }
                    if (this.f.v() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || (true ^ this.e.isEmpty())) {
                        a aVar = new a(this.e);
                        if (z) {
                            this.b.h();
                            zna E = this.f.E();
                            tn1.Q(E, aVar);
                            Unit unit = Unit.a;
                            E.G();
                            this.b.clear();
                            this.b.e();
                            aVar.f();
                        }
                        aVar.e();
                    }
                    this.q.j0();
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.q(this);
    }

    @Override // defpackage.jv1, defpackage.g99
    public void b(Object obj) {
        e99 w0;
        Object[] b;
        z65.h(obj, "value");
        if (!B() && (w0 = this.q.w0()) != null) {
            w0.F(true);
            if (!w0.v(obj)) {
                this.g.c(obj, w0);
                if (obj instanceof t03) {
                    this.i.n(obj);
                    for (Object obj2 : ((t03) obj).l().b()) {
                        if (obj2 != null) {
                            this.i.c(obj2, obj);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.jv1
    public void c(Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        try {
            synchronized (this.d) {
                z();
                kt4<e99, lt4<Object>> G = G();
                try {
                    this.q.e0(G, function2);
                    Unit unit = Unit.a;
                } catch (Exception e) {
                    this.m = G;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.e.isEmpty()) {
                    new a(this.e).e();
                }
                throw th;
            } catch (Exception e2) {
                u();
                throw e2;
            }
        }
    }

    @Override // defpackage.g99
    public j75 d(e99 e99Var, Object obj) {
        io1 io1Var;
        z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        if (e99Var.l()) {
            e99Var.B(true);
        }
        rd j = e99Var.j();
        if (j != null && j.b()) {
            if (!this.f.F(j)) {
                synchronized (this.d) {
                    io1Var = this.o;
                }
                if (io1Var != null && io1Var.H(e99Var, obj)) {
                    return j75.IMMINENT;
                }
                return j75.IGNORED;
            } else if (!e99Var.k()) {
                return j75.IGNORED;
            } else {
                return C(e99Var, j, obj);
            }
        }
        return j75.IGNORED;
    }

    @Override // defpackage.jv1
    public void e() {
        synchronized (this.d) {
            try {
                if (!this.k.isEmpty()) {
                    x(this.k);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).e();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e) {
                    u();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.jv1
    public <R> R f(jv1 jv1Var, int i, Function0<? extends R> function0) {
        z65.h(function0, "block");
        if (jv1Var != null && !z65.c(jv1Var, this) && i >= 0) {
            this.o = (io1) jv1Var;
            this.p = i;
            try {
                return function0.invoke();
            } finally {
                this.o = null;
                this.p = 0;
            }
        }
        return function0.invoke();
    }

    @Override // defpackage.jv1
    public void g(List<Pair<hp6, hp6>> list) {
        z65.h(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!z65.c(list.get(i).c().b(), this)) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        tn1.T(z);
        try {
            this.q.E0(list);
            Unit unit = Unit.a;
        } finally {
        }
    }

    @Override // defpackage.jv1
    public void h(gp6 gp6Var) {
        z65.h(gp6Var, "state");
        a aVar = new a(this.e);
        zna E = gp6Var.a().E();
        try {
            tn1.Q(E, aVar);
            Unit unit = Unit.a;
            E.G();
            aVar.f();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    @Override // defpackage.co1
    public boolean i() {
        return this.t;
    }

    @Override // defpackage.co1
    public void j(Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        if (!this.t) {
            this.u = function2;
            this.a.a(this, function2);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // defpackage.jv1
    public boolean k() {
        boolean S0;
        synchronized (this.d) {
            try {
                z();
                kt4<e99, lt4<Object>> G = G();
                try {
                    S0 = this.q.S0(G);
                    if (!S0) {
                        A();
                    }
                } catch (Exception e) {
                    this.m = G;
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return S0;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // defpackage.jv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            defpackage.z65.h(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            mt4<e99> r1 = r2.g
            boolean r1 = r1.e(r0)
            if (r1 != 0) goto L23
            mt4<t03<?>> r1 = r2.i
            boolean r0 = r1.e(r0)
            if (r0 == 0) goto L9
        L23:
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.l(java.util.Set):boolean");
    }

    @Override // defpackage.jv1
    public void m(Function0<Unit> function0) {
        z65.h(function0, "block");
        this.q.L0(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Set[]] */
    @Override // defpackage.jv1
    public void n(Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> set2;
        ?? w;
        z65.h(set, "values");
        do {
            obj = this.c.get();
            if (obj == null || z65.c(obj, jo1.c())) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                z65.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                w = xr.w((Set[]) obj, set);
                set2 = w;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
            }
        } while (!ho1.a(this.c, obj, set2));
        if (obj == null) {
            synchronized (this.d) {
                A();
                Unit unit = Unit.a;
            }
        }
    }

    @Override // defpackage.jv1
    public void o() {
        synchronized (this.d) {
            try {
                x(this.j);
                A();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).e();
                        }
                        throw th;
                    } catch (Exception e) {
                        u();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.jv1
    public boolean p() {
        return this.q.H0();
    }

    @Override // defpackage.jv1
    public void q(Object obj) {
        int f;
        lt4 o;
        z65.h(obj, "value");
        synchronized (this.d) {
            try {
                D(obj);
                mt4<t03<?>> mt4Var = this.i;
                f = mt4Var.f(obj);
                if (f >= 0) {
                    o = mt4Var.o(f);
                    Object[] t = o.t();
                    int size = o.size();
                    for (int i = 0; i < size; i++) {
                        Object obj2 = t[i];
                        z65.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        D((t03) obj2);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jv1
    public void r() {
        synchronized (this.d) {
            try {
                this.q.b0();
                if (!this.e.isEmpty()) {
                    new a(this.e).e();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).e();
                        }
                        throw th;
                    } catch (Exception e) {
                        u();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.g99
    public void s(e99 e99Var) {
        z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        this.n = true;
    }

    @Override // defpackage.jv1
    public void t() {
        Object[] x;
        e99 e99Var;
        synchronized (this.d) {
            try {
                for (Object obj : this.f.x()) {
                    if (obj instanceof e99) {
                        e99Var = (e99) obj;
                    } else {
                        e99Var = null;
                    }
                    if (e99Var != null) {
                        e99Var.invalidate();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ io1(do1 do1Var, wp wpVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(do1Var, wpVar, (i & 4) != 0 ? null : coroutineContext);
    }
}
