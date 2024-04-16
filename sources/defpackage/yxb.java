package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VerificationProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lyxb;", "", "", "a", "I", "i", "()I", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "captcha_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: yxb  reason: default package */
/* loaded from: classes.dex */
public enum yxb {
    H_CAPTCHA(1),
    YA_CAPTCHA(2),
    UNKNOWN(0);
    
    public static final a b = new a(null);
    private final int a;

    /* compiled from: VerificationProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lyxb$a;", "", "", "value", "Lyxb;", "a", "(Ljava/lang/Integer;)Lyxb;", "<init>", "()V", "captcha_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: yxb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yxb a(Integer num) {
            yxb[] values;
            for (yxb yxbVar : yxb.values()) {
                int i = yxbVar.i();
                if (num != null && i == num.intValue()) {
                    return yxbVar;
                }
            }
            return null;
        }
    }

    yxb(int i) {
        this.a = i;
    }

    public final int i() {
        return this.a;
    }
}
