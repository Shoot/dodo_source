package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ViewProductCategoryRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Le0c;", "", "Lnl8;", "productCategory", "Lnl8;", "getProductCategory", "()Lnl8;", "Lr42;", "customerAction", "Lr42;", "getCustomerAction", "()Lr42;", "<init>", "(Lnl8;Lr42;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: e0c  reason: default package */
/* loaded from: classes.dex */
public class e0c {
    @uca("customerAction")
    private final r42 customerAction;
    @uca("productCategory")
    private final nl8 productCategory;

    public e0c() {
        this(null, null, 3, null);
    }

    public final r42 getCustomerAction() {
        return this.customerAction;
    }

    public final nl8 getProductCategory() {
        return this.productCategory;
    }

    public e0c(nl8 nl8Var, r42 r42Var) {
        this.productCategory = nl8Var;
        this.customerAction = r42Var;
    }

    public /* synthetic */ e0c(nl8 nl8Var, r42 r42Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nl8Var, (i & 2) != 0 ? null : r42Var);
    }
}
