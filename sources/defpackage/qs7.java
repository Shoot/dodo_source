package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PaymentAuthorize.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0001\u0003B\u0011\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lqs7;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentId", "<init>", "(Ljava/lang/String;)V", "b", "Lrs7;", "Lss7;", "Lus7;", "Lvs7;", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qs7  reason: default package */
/* loaded from: classes2.dex */
public abstract class qs7 implements Serializable {
    public static final a b = new a(null);
    private final String a;

    /* compiled from: PaymentAuthorize.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lqs7$a;", "", "", "paymentId", "Lqs7;", c.a, "a", "navigateUrl", "termUrl", "paReq", "md", DateTokenConverter.CONVERTER_KEY, "b", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qs7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qs7 a(String str) {
            z65.h(str, "paymentId");
            return new ss7(str);
        }

        public final qs7 b(String str, String str2) {
            z65.h(str, "paymentId");
            z65.h(str2, "navigateUrl");
            return new us7(str, str2);
        }

        public final qs7 c(String str) {
            z65.h(str, "paymentId");
            return new vs7(str);
        }

        public final qs7 d(String str, String str2, String str3, String str4, String str5) {
            z65.h(str, "paymentId");
            z65.h(str2, "navigateUrl");
            z65.h(str3, "termUrl");
            z65.h(str4, "paReq");
            z65.h(str5, "md");
            return new rs7(str, str2, str4, str5, str3);
        }
    }

    public /* synthetic */ qs7(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.a;
    }

    private qs7(String str) {
        this.a = str;
    }
}
