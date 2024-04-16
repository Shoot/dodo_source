package defpackage;

import com.dodopizza.geo.feature.deliveryaddresslist.presentation.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliverySelectionResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrz2;", "Lqg1;", "Lsz2;", "a", "Lsz2;", "()Lsz2;", MessageAttributes.TYPE, "<init>", "(Lsz2;)V", "b", com.huawei.hms.opendevice.c.a, "Lrz2$a;", "Lrz2$b;", "Lrz2$c;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rz2  reason: default package */
/* loaded from: classes2.dex */
public abstract class rz2 implements qg1 {
    private final sz2 a;

    /* compiled from: DeliverySelectionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrz2$a;", "Lrz2;", "Liv0;", "changeLocationResult", "<init>", "(Liv0;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rz2$a */
    /* loaded from: classes2.dex */
    public static final class a extends rz2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(iv0 iv0Var) {
            super(sz2.a, null);
            z65.h(iv0Var, "changeLocationResult");
        }
    }

    /* compiled from: DeliverySelectionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrz2$b;", "Lrz2;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;", "newLocationResult", "<init>", "(Lcom/dodopizza/geo/feature/deliveryaddresslist/presentation/c$a$a;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rz2$b */
    /* loaded from: classes2.dex */
    public static final class b extends rz2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c.a.C0131a c0131a) {
            super(sz2.b, null);
            z65.h(c0131a, "newLocationResult");
        }
    }

    /* compiled from: DeliverySelectionResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lrz2$c;", "Lrz2;", "Lsz2;", "b", "Lsz2;", "a", "()Lsz2;", MessageAttributes.TYPE, "<init>", "(Lsz2;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rz2$c */
    /* loaded from: classes2.dex */
    public static final class c extends rz2 {
        private final sz2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sz2 sz2Var) {
            super(sz2Var, null);
            z65.h(sz2Var, MessageAttributes.TYPE);
            this.b = sz2Var;
        }

        @Override // defpackage.rz2
        public sz2 a() {
            return this.b;
        }
    }

    public /* synthetic */ rz2(sz2 sz2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(sz2Var);
    }

    public sz2 a() {
        return this.a;
    }

    private rz2(sz2 sz2Var) {
        this.a = sz2Var;
    }
}
