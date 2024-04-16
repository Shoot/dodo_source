package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewProductRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B-\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0015\b\u0016\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0013B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0014B\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lg0c;", "", "Lbm8;", "product", "Lbm8;", "getProduct", "()Lbm8;", "Lsl8;", "productGroup", "Lsl8;", "getProductGroup", "()Lsl8;", "Lr42;", "customerAction", "Lr42;", "getCustomerAction", "()Lr42;", "<init>", "(Lbm8;Lsl8;Lr42;)V", "(Lr42;)V", "(Lbm8;Lr42;)V", "(Lsl8;Lr42;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: g0c  reason: default package */
/* loaded from: classes.dex */
public class g0c {
    @uca("customerAction")
    private final r42 customerAction;
    @uca("product")
    private final bm8 product;
    @uca("productGroup")
    private final sl8 productGroup;

    private g0c(bm8 bm8Var, sl8 sl8Var, r42 r42Var) {
        this.product = bm8Var;
        this.productGroup = sl8Var;
        this.customerAction = r42Var;
    }

    public final r42 getCustomerAction() {
        return this.customerAction;
    }

    public final bm8 getProduct() {
        return this.product;
    }

    public final sl8 getProductGroup() {
        return this.productGroup;
    }

    /* synthetic */ g0c(bm8 bm8Var, sl8 sl8Var, r42 r42Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bm8Var, (i & 2) != 0 ? null : sl8Var, (i & 4) != 0 ? null : r42Var);
    }

    public g0c(r42 r42Var) {
        this((bm8) null, (sl8) null, r42Var);
    }

    public /* synthetic */ g0c(r42 r42Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r42Var);
    }

    public /* synthetic */ g0c(bm8 bm8Var, r42 r42Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bm8Var, (i & 2) != 0 ? null : r42Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0c(bm8 bm8Var, r42 r42Var) {
        this(bm8Var, (sl8) null, r42Var);
        z65.h(bm8Var, "product");
    }

    public /* synthetic */ g0c(sl8 sl8Var, r42 r42Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sl8Var, (i & 2) != 0 ? null : r42Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0c(sl8 sl8Var, r42 r42Var) {
        this((bm8) null, sl8Var, r42Var);
        z65.h(sl8Var, "productGroup");
    }
}
