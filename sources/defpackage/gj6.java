package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MinDeliveryPriceState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lgj6;", "", "<init>", "()V", "a", "b", "Lgj6$a;", "Lgj6$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gj6  reason: default package */
/* loaded from: classes2.dex */
public abstract class gj6 {

    /* compiled from: MinDeliveryPriceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgj6$a;", "Lgj6;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gj6$a */
    /* loaded from: classes2.dex */
    public static final class a extends gj6 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: MinDeliveryPriceState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lgj6$b;", "Lgj6;", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "priceBelowMinPrice", "<init>", "(Lhn6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gj6$b */
    /* loaded from: classes2.dex */
    public static final class b extends gj6 {
        private final hn6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hn6 hn6Var) {
            super(null);
            z65.h(hn6Var, "priceBelowMinPrice");
            this.a = hn6Var;
        }

        public final hn6 a() {
            return this.a;
        }
    }

    private gj6() {
    }

    public /* synthetic */ gj6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
