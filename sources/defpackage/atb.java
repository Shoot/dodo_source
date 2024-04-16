package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UpsaleProductVO.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Latb;", "", "<init>", "()V", "a", "Latb$a;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: atb  reason: default package */
/* loaded from: classes2.dex */
public abstract class atb {

    /* compiled from: UpsaleProductVO.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\n\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, d2 = {"Latb$a;", "Latb;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "Ltl8;", c.a, "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "", "D", "f", "()D", "price", e.a, "I", "()I", "orderInCart", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "category", "Lftb;", "g", "Lftb;", "()Lftb;", "upsaleSizeDetailsVO", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltl8;DILjava/lang/Integer;Lftb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: atb$a */
    /* loaded from: classes2.dex */
    public static final class a extends atb {
        private final String a;
        private final String b;
        private final tl8 c;
        private final double d;
        private final int e;
        private final Integer f;
        private final ftb g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, tl8 tl8Var, double d, int i, Integer num, ftb ftbVar) {
            super(null);
            z65.h(str, "id");
            z65.h(str2, Action.NAME_ATTRIBUTE);
            z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
            z65.h(ftbVar, "upsaleSizeDetailsVO");
            this.a = str;
            this.b = str2;
            this.c = tl8Var;
            this.d = d;
            this.e = i;
            this.f = num;
            this.g = ftbVar;
        }

        public final Integer a() {
            return this.f;
        }

        public final String b() {
            return this.a;
        }

        public final tl8 c() {
            return this.c;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && z65.c(this.c, aVar.c) && Double.compare(this.d, aVar.d) == 0 && this.e == aVar.e && z65.c(this.f, aVar.f) && z65.c(this.g, aVar.g)) {
                return true;
            }
            return false;
        }

        public final double f() {
            return this.d;
        }

        public final ftb g() {
            return this.g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + nkb.a(this.d)) * 31) + this.e) * 31;
            Integer num = this.f;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.g.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            tl8 tl8Var = this.c;
            double d = this.d;
            int i = this.e;
            Integer num = this.f;
            ftb ftbVar = this.g;
            return "UpsaleProductItemVO(id=" + str + ", name=" + str2 + ", image=" + tl8Var + ", price=" + d + ", orderInCart=" + i + ", category=" + num + ", upsaleSizeDetailsVO=" + ftbVar + ")";
        }
    }

    private atb() {
    }

    public /* synthetic */ atb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
