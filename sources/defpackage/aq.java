package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpecialOfferVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Laq;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "Laq$a;", "Laq$b;", "Laq$c;", "Laq$d;", "Laq$e;", "Laq$f;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aq implements Serializable {

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Laq$a;", "Laq;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "productCategoryId", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$a */
    /* loaded from: classes2.dex */
    public static final class a extends aq {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            z65.h(str, "productCategoryId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Laq$b;", "Laq;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$b */
    /* loaded from: classes2.dex */
    public static final class b extends aq {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            z65.h(str, RemoteMessageConst.Notification.URL);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq$c;", "Laq;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$c */
    /* loaded from: classes2.dex */
    public static final class c extends aq {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Laq$d;", "Laq;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "promoActionId", "b", "getPromoCodeValue", "promoCodeValue", "Lr67;", com.huawei.hms.opendevice.c.a, "Lr67;", "()Lr67;", "validationPeriod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lr67;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$d */
    /* loaded from: classes2.dex */
    public static final class d extends aq {
        private final String a;
        private final String b;
        private final r67 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, r67 r67Var) {
            super(null);
            z65.h(str, "promoActionId");
            z65.h(str2, "promoCodeValue");
            this.a = str;
            this.b = str2;
            this.c = r67Var;
        }

        public final String a() {
            return this.a;
        }

        public final r67 b() {
            return this.c;
        }
    }

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Laq$e;", "Laq;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$e */
    /* loaded from: classes2.dex */
    public static final class e extends aq {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            z65.h(str, "menuItemId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: SpecialOfferVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Laq$f;", "Laq;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "promoCodeValue", "Lr67;", "b", "Lr67;", "()Lr67;", "validationPeriod", "<init>", "(Ljava/lang/String;Lr67;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: aq$f */
    /* loaded from: classes2.dex */
    public static final class f extends aq {
        private final String a;
        private final r67 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, r67 r67Var) {
            super(null);
            z65.h(str, "promoCodeValue");
            this.a = str;
            this.b = r67Var;
        }

        public final String a() {
            return this.a;
        }

        public final r67 b() {
            return this.b;
        }
    }

    private aq() {
    }

    public /* synthetic */ aq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
