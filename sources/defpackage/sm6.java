package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Modifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&J\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lsm6;", "", "R", "initial", "Lkotlin/Function2;", "Lsm6$b;", "operation", Image.TYPE_HIGH, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "i", "other", "f", "a", "b", com.huawei.hms.opendevice.c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sm6  reason: default package */
/* loaded from: classes.dex */
public interface sm6 {
    public static final a a = a.c;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0011\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, d2 = {"Lsm6$a;", "Lsm6;", "R", "initial", "Lkotlin/Function2;", "Lsm6$b;", "operation", Image.TYPE_HIGH, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "i", "other", "f", "", "toString", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sm6$a */
    /* loaded from: classes.dex */
    public static final class a implements sm6 {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        @Override // defpackage.sm6
        public sm6 f(sm6 sm6Var) {
            z65.h(sm6Var, "other");
            return sm6Var;
        }

        @Override // defpackage.sm6
        public <R> R h(R r, Function2<? super R, ? super b, ? extends R> function2) {
            z65.h(function2, "operation");
            return r;
        }

        @Override // defpackage.sm6
        public boolean i(Function1<? super b, Boolean> function1) {
            z65.h(function1, "predicate");
            return true;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lsm6$b;", "Lsm6;", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sm6$b */
    /* loaded from: classes.dex */
    public interface b extends sm6 {
    }

    sm6 f(sm6 sm6Var);

    <R> R h(R r, Function2<? super R, ? super b, ? extends R> function2);

    boolean i(Function1<? super b, Boolean> function1);

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001a\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bY\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\f\u0010\bJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R$\u0010/\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u0015R$\u00103\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u0015R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010G\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u0016\u0010M\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010BR\u0016\u0010O\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010BR$\u0010R\u001a\u00020@2\u0006\u0010\u0016\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010DR\u0011\u0010U\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010X\u001a\u00020@8VX\u0096\u0004¢\u0006\f\u0012\u0004\bW\u0010\b\u001a\u0004\bV\u0010D¨\u0006Z"}, d2 = {"Lsm6$c;", "Lzt2;", "Loz6;", "coordinator", "", "e1", "(Loz6;)V", "N0", "()V", "T0", "U0", "O0", "S0", "P0", "Q0", "R0", "Lkotlin/Function0;", "effect", "d1", "owner", "W0", "(Lsm6$c;)V", "<set-?>", "a", "Lsm6$c;", "I", "()Lsm6$c;", "getNode$annotations", "node", "Lqx1;", "b", "Lqx1;", Action.SCOPE_ATTRIBUTE, "", com.huawei.hms.opendevice.c.a, "H0", "()I", "Z0", "(I)V", "kindSet", DateTokenConverter.CONVERTER_KEY, "C0", "V0", "aggregateChildKindSet", e.a, "J0", "b1", "parent", "f", "D0", "X0", "child", "Lm67;", "g", "Lm67;", "I0", "()Lm67;", "a1", "(Lm67;)V", "ownerScope", Image.TYPE_HIGH, "Loz6;", "E0", "()Loz6;", "", "i", "Z", "G0", "()Z", "Y0", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "j", "L0", "c1", "updatedNodeAwaitingAttachForInvalidation", "k", "onAttachRunExpected", "l", "onDetachRunExpected", Image.TYPE_MEDIUM, "M0", "isAttached", "F0", "()Lqx1;", "coroutineScope", "K0", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sm6$c */
    /* loaded from: classes.dex */
    public static abstract class c implements zt2 {
        private qx1 b;
        private int c;
        private c e;
        private c f;
        private m67 g;
        private oz6 h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private c a = this;
        private int d = -1;

        public final int C0() {
            return this.d;
        }

        public final c D0() {
            return this.f;
        }

        public final oz6 E0() {
            return this.h;
        }

        public final qx1 F0() {
            qx1 qx1Var = this.b;
            if (qx1Var == null) {
                qx1 a = rx1.a(au2.j(this).getCoroutineContext().P(q95.a((l95) au2.j(this).getCoroutineContext().c(l95.M))));
                this.b = a;
                return a;
            }
            return qx1Var;
        }

        public final boolean G0() {
            return this.i;
        }

        public final int H0() {
            return this.c;
        }

        @Override // defpackage.zt2
        public final c I() {
            return this.a;
        }

        public final m67 I0() {
            return this.g;
        }

        public final c J0() {
            return this.e;
        }

        public boolean K0() {
            return true;
        }

        public final boolean L0() {
            return this.j;
        }

        public final boolean M0() {
            return this.m;
        }

        public void N0() {
            if (!this.m) {
                if (this.h != null) {
                    this.m = true;
                    this.k = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void O0() {
            if (this.m) {
                if (!this.k) {
                    if (!this.l) {
                        this.m = false;
                        qx1 qx1Var = this.b;
                        if (qx1Var != null) {
                            rx1.c(qx1Var, new en6());
                            this.b = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void S0() {
            if (this.m) {
                R0();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void T0() {
            if (this.m) {
                if (this.k) {
                    this.k = false;
                    P0();
                    this.l = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void U0() {
            if (this.m) {
                if (this.h != null) {
                    if (this.l) {
                        this.l = false;
                        Q0();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public final void V0(int i) {
            this.d = i;
        }

        public final void W0(c cVar) {
            z65.h(cVar, "owner");
            this.a = cVar;
        }

        public final void X0(c cVar) {
            this.f = cVar;
        }

        public final void Y0(boolean z) {
            this.i = z;
        }

        public final void Z0(int i) {
            this.c = i;
        }

        public final void a1(m67 m67Var) {
            this.g = m67Var;
        }

        public final void b1(c cVar) {
            this.e = cVar;
        }

        public final void c1(boolean z) {
            this.j = z;
        }

        public final void d1(Function0<Unit> function0) {
            z65.h(function0, "effect");
            au2.j(this).n(function0);
        }

        public void e1(oz6 oz6Var) {
            this.h = oz6Var;
        }

        public void P0() {
        }

        public void Q0() {
        }

        public void R0() {
        }
    }
}
