package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MediaType.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0004B/\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0011\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lqc6;", "", "Ljava/nio/charset/Charset;", "defaultValue", "a", "", Action.NAME_ATTRIBUTE, "f", "toString", "other", "", "equals", "", "hashCode", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "mediaType", "b", "i", MessageAttributes.TYPE, c.a, Image.TYPE_HIGH, "subtype", "", "[Ljava/lang/String;", e.a, "()[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: qc6  reason: default package */
/* loaded from: classes3.dex */
public final class qc6 {
    public static final a e = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final String[] d;

    /* compiled from: MediaType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lqc6$a;", "", "", "Lqc6;", "a", "(Ljava/lang/String;)Lqc6;", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qc6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qc6 a(String str) {
            z65.h(str, "<this>");
            return tdc.d(str);
        }

        public final qc6 b(String str) {
            z65.h(str, "<this>");
            return tdc.e(str);
        }
    }

    public qc6(String str, String str2, String str3, String[] strArr) {
        z65.h(str, "mediaType");
        z65.h(str2, MessageAttributes.TYPE);
        z65.h(str3, "subtype");
        z65.h(strArr, "parameterNamesAndValues");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public static /* synthetic */ Charset b(qc6 qc6Var, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return qc6Var.a(charset);
    }

    public static final qc6 c(String str) {
        return e.a(str);
    }

    public static final qc6 g(String str) {
        return e.b(str);
    }

    public final Charset a(Charset charset) {
        String f = f("charset");
        if (f == null) {
            return charset;
        }
        try {
            return Charset.forName(f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String d() {
        return this.a;
    }

    public final String[] e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return tdc.a(this, obj);
    }

    public final String f(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return tdc.c(this, str);
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return tdc.b(this);
    }

    public final String i() {
        return this.b;
    }

    public String toString() {
        return tdc.f(this);
    }
}
