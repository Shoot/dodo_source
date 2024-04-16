package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductListItemRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BE\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0015\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0015\u0010\u001bB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001dB\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u001eB\u001d\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006¨\u0006 "}, d2 = {"Lwl8;", "", "", "count", "Ljava/lang/Double;", "getCount", "()Ljava/lang/Double;", "Lbm8;", "product", "Lbm8;", "getProduct", "()Lbm8;", "Lsl8;", "productGroup", "Lsl8;", "getProductGroup", "()Lsl8;", "pricePerItem", "getPricePerItem", "priceOfLine", "getPriceOfLine", "<init>", "(Ljava/lang/Double;Lbm8;Lsl8;Ljava/lang/Double;Ljava/lang/Double;)V", "(Ljava/lang/Double;)V", "price", "", "isPricePerItem", "(DDZ)V", "(DLbm8;Ljava/lang/Double;Ljava/lang/Boolean;)V", "(DLsl8;Ljava/lang/Double;Ljava/lang/Boolean;)V", "(Lbm8;Ljava/lang/Double;)V", "(Lsl8;Ljava/lang/Double;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wl8  reason: default package */
/* loaded from: classes.dex */
public class wl8 {
    @uca("count")
    private final Double count;
    @uca("priceOfLine")
    private final Double priceOfLine;
    @uca("pricePerItem")
    private final Double pricePerItem;
    @uca("product")
    private final bm8 product;
    @uca("productGroup")
    private final sl8 productGroup;

    private wl8(Double d, bm8 bm8Var, sl8 sl8Var, Double d2, Double d3) {
        this.count = d;
        this.product = bm8Var;
        this.productGroup = sl8Var;
        this.pricePerItem = d2;
        this.priceOfLine = d3;
    }

    public final Double getCount() {
        return this.count;
    }

    public final Double getPriceOfLine() {
        return this.priceOfLine;
    }

    public final Double getPricePerItem() {
        return this.pricePerItem;
    }

    public final bm8 getProduct() {
        return this.product;
    }

    public final sl8 getProductGroup() {
        return this.productGroup;
    }

    /* synthetic */ wl8(Double d, bm8 bm8Var, sl8 sl8Var, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : bm8Var, (i & 4) != 0 ? null : sl8Var, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3);
    }

    public wl8(Double d) {
        this(d, null, null, null, null);
    }

    public /* synthetic */ wl8(Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d);
    }

    public wl8(double d, double d2, boolean z) {
        this(Double.valueOf(d), null, null, z ? Double.valueOf(d2) : null, z ? null : Double.valueOf(d2), 6, null);
    }

    public /* synthetic */ wl8(double d, bm8 bm8Var, Double d2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, bm8Var, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wl8(double d, bm8 bm8Var, Double d2, Boolean bool) {
        this(Double.valueOf(d), bm8Var, null, z65.c(bool, Boolean.TRUE) ? d2 : null, z65.c(bool, Boolean.FALSE) ? d2 : null, 4, null);
        z65.h(bm8Var, "product");
    }

    public /* synthetic */ wl8(double d, sl8 sl8Var, Double d2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, sl8Var, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wl8(double d, sl8 sl8Var, Double d2, Boolean bool) {
        this(Double.valueOf(d), null, sl8Var, z65.c(bool, Boolean.TRUE) ? d2 : null, z65.c(bool, Boolean.FALSE) ? d2 : null, 2, null);
        z65.h(sl8Var, "productGroup");
    }

    public /* synthetic */ wl8(bm8 bm8Var, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bm8Var, (i & 2) != 0 ? null : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wl8(bm8 bm8Var, Double d) {
        this(null, bm8Var, null, d, null, 20, null);
        z65.h(bm8Var, "product");
    }

    public /* synthetic */ wl8(sl8 sl8Var, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sl8Var, (i & 2) != 0 ? null : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wl8(sl8 sl8Var, Double d) {
        this(null, null, sl8Var, d, null, 18, null);
        z65.h(sl8Var, "productGroup");
    }
}
