package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EncryptionData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\fR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0018\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u001d\u0010\u0016R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b \u0010\u0016¨\u0006$"}, d2 = {"Loh3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "timestamp", "b", "getUuid", MessageAttributes.UUID, c.a, "mdorder", DateTokenConverter.CONVERTER_KEY, e.a, "setPublicKey", "(Ljava/lang/String;)V", "publicKey", "setApiKey", "apiKey", "setProjectId", "projectId", "g", "setClientId", MessageAttributes.CLIENT_ID, Image.TYPE_HIGH, "setTokenizationHost", "tokenizationHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oh3  reason: default package */
/* loaded from: classes2.dex */
public final class oh3 {
    private final String a;
    private final String b;
    private final String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public oh3() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh3)) {
            return false;
        }
        oh3 oh3Var = (oh3) obj;
        if (z65.c(this.a, oh3Var.a) && z65.c(this.b, oh3Var.b) && z65.c(this.c, oh3Var.c) && z65.c(this.d, oh3Var.d) && z65.c(this.e, oh3Var.e) && z65.c(this.f, oh3Var.f) && z65.c(this.g, oh3Var.g) && z65.c(this.h, oh3Var.h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        return "EncryptionData(timestamp=" + str + ", uuid=" + str2 + ", mdorder=" + str3 + ", publicKey=" + str4 + ", apiKey=" + str5 + ", projectId=" + str6 + ", clientId=" + str7 + ", tokenizationHost=" + str8 + ")";
    }

    public oh3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        z65.h(str, "timestamp");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, "mdorder");
        z65.h(str4, "publicKey");
        z65.h(str5, "apiKey");
        z65.h(str6, "projectId");
        z65.h(str7, MessageAttributes.CLIENT_ID);
        z65.h(str8, "tokenizationHost");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public /* synthetic */ oh3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
