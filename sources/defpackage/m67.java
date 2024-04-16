package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ObserverModifierNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lm67;", "Lvm7;", "Lk67;", "a", "Lk67;", "b", "()Lk67;", "observerNode", "", "b0", "()Z", "isValidOwnerScope", "<init>", "(Lk67;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: m67  reason: default package */
/* loaded from: classes.dex */
public final class m67 implements vm7 {
    public static final b b = new b(null);
    private static final Function1<m67, Unit> c = a.a;
    private final k67 a;

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm67;", "it", "", "a", "(Lm67;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m67$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<m67, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(m67 m67Var) {
            z65.h(m67Var, "it");
            if (m67Var.b0()) {
                m67Var.b().L();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m67 m67Var) {
            a(m67Var);
            return Unit.a;
        }
    }

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lm67$b;", "", "Lkotlin/Function1;", "Lm67;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: m67$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function1<m67, Unit> a() {
            return m67.c;
        }
    }

    public m67(k67 k67Var) {
        z65.h(k67Var, "observerNode");
        this.a = k67Var;
    }

    public final k67 b() {
        return this.a;
    }

    @Override // defpackage.vm7
    public boolean b0() {
        return this.a.I().M0();
    }
}
