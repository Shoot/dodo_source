package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RecommendationRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lc99;", "", "", "limit", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "Lwq;", "area", "Lwq;", "getArea", "()Lwq;", "Lnl8;", "productCategory", "Lnl8;", "getProductCategory", "()Lnl8;", "Lbm8;", "product", "Lbm8;", "getProduct", "()Lbm8;", "<init>", "(Ljava/lang/Integer;Lwq;Lnl8;Lbm8;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: c99  reason: default package */
/* loaded from: classes.dex */
public class c99 {
    @uca("area")
    private final wq area;
    @uca("limit")
    private final Integer limit;
    @uca("product")
    private final bm8 product;
    @uca("productCategory")
    private final nl8 productCategory;

    public c99() {
        this(null, null, null, null, 15, null);
    }

    public final wq getArea() {
        return this.area;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final bm8 getProduct() {
        return this.product;
    }

    public final nl8 getProductCategory() {
        return this.productCategory;
    }

    public c99(Integer num, wq wqVar, nl8 nl8Var, bm8 bm8Var) {
        this.limit = num;
        this.area = wqVar;
        this.productCategory = nl8Var;
        this.product = bm8Var;
    }

    public /* synthetic */ c99(Integer num, wq wqVar, nl8 nl8Var, bm8 bm8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : wqVar, (i & 4) != 0 ? null : nl8Var, (i & 8) != 0 ? null : bm8Var);
    }
}
