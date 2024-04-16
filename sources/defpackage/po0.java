package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CaptchaMode.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lpo0;", "", "", "a", "I", "value", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: po0  reason: default package */
/* loaded from: classes.dex */
public enum po0 {
    INVISIBLE(0),
    COMPACT(1),
    NORMAL(2);
    
    public static final a b = new a(null);
    private final int a;

    /* compiled from: CaptchaMode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lpo0$a;", "", "", "value", "Lpo0;", "a", "(Ljava/lang/Integer;)Lpo0;", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: po0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final po0 a(Integer num) {
            po0[] values;
            for (po0 po0Var : po0.values()) {
                int i = po0Var.a;
                if (num != null && i == num.intValue()) {
                    return po0Var;
                }
            }
            return null;
        }
    }

    po0(int i) {
        this.a = i;
    }
}
