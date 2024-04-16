package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Confirm3DSResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Liq1;", "", "<init>", "()V", "a", "b", "Liq1$a;", "Liq1$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iq1  reason: default package */
/* loaded from: classes4.dex */
public abstract class iq1 {

    /* compiled from: Confirm3DSResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Liq1$a;", "Liq1;", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "<init>", "(Lb61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iq1$a */
    /* loaded from: classes4.dex */
    public static final class a extends iq1 {
        private final b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b61 b61Var) {
            super(null);
            z65.h(b61Var, "checkoutState");
            this.a = b61Var;
        }

        public final b61 a() {
            return this.a;
        }
    }

    /* compiled from: Confirm3DSResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liq1$b;", "Liq1;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: iq1$b */
    /* loaded from: classes4.dex */
    public static final class b extends iq1 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private iq1() {
    }

    public /* synthetic */ iq1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
