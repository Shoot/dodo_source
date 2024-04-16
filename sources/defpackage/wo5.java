package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LegalInformation.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0003B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Lwo5;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "title", DateTokenConverter.CONVERTER_KEY, RemoteMessageConst.Notification.URL, c.a, "text", "", "I", "()I", MessageAttributes.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo5  reason: default package */
/* loaded from: classes4.dex */
public final class wo5 implements Serializable {
    public static final a e = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final int d;

    /* compiled from: LegalInformation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lwo5$a;", "", "", "AGREEMENT", "I", "BONUS", "OFFER", "PERSONAL_DATA", "POLICY", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public wo5(String str, String str2, String str3, int i) {
        z65.h(str, "title");
        z65.h(str2, RemoteMessageConst.Notification.URL);
        z65.h(str3, "text");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
