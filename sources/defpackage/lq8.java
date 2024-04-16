package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PromotionProductVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Llq8;", "", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Llq8$a;", "Llq8$b;", "Llq8$c;", "Llq8$d;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lq8  reason: default package */
/* loaded from: classes2.dex */
public abstract class lq8 {

    /* compiled from: PromotionProductVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq8$a;", "Llq8;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lq8$a */
    /* loaded from: classes2.dex */
    public static final class a extends lq8 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: PromotionProductVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq8$b;", "Llq8;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lq8$b */
    /* loaded from: classes2.dex */
    public static final class b extends lq8 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: PromotionProductVO.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Llq8$c;", "Llq8;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lkm8;", "a", "Lkm8;", "()Lkm8;", "productSize", "<init>", "(Lkm8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lq8$c */
    /* loaded from: classes2.dex */
    public static final class c extends lq8 {
        private final km8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(km8 km8Var) {
            super(null);
            z65.h(km8Var, "productSize");
            this.a = km8Var;
        }

        public final km8 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            km8 km8Var = this.a;
            return "SimplePromotionProduct(productSize=" + km8Var + ")";
        }
    }

    /* compiled from: PromotionProductVO.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Llq8$d;", "Llq8;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "getProductsCount", "()I", "productsCount", "<init>", "(I)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lq8$d */
    /* loaded from: classes2.dex */
    public static final class d extends lq8 {
        private final int a;

        public d(int i) {
            super(null);
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.a == ((d) obj).a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            int i = this.a;
            return "VariablePromotionProduct(productsCount=" + i + ")";
        }
    }

    private lq8() {
    }

    public /* synthetic */ lq8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
