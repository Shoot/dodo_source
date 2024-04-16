package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PhotoPreviewVO.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\nB+\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\n\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006\""}, d2 = {"Lq58;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "uploadId", "b", "photoPath", "I", DateTokenConverter.CONVERTER_KEY, "()I", "j", "(I)V", "uploadPercents", "Z", "()Z", "f", "(Z)V", "containsUploadFailure", e.a, "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q58  reason: default package */
/* loaded from: classes.dex */
public final class q58 implements Serializable {
    public static final a e = new a(null);
    private String a;
    private final String b;
    private int c;
    private boolean d;

    /* compiled from: PhotoPreviewVO.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lq58$a;", "", "", "CHANGE_PERCENTS", "Ljava/lang/String;", "CHANGE_UPLOAD_FAILURE", "", "MAX_UPLOAD_PERCENT", "I", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: q58$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public q58(String str, String str2, int i, boolean z) {
        z65.h(str, "uploadId");
        z65.h(str2, "photoPath");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        if (this.c != 100 && !this.d) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q58)) {
            return false;
        }
        q58 q58Var = (q58) obj;
        if (z65.c(this.a, q58Var.a) && z65.c(this.b, q58Var.b) && this.c == q58Var.c && this.d == q58Var.d) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d = z;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + a91.a(this.d);
    }

    public final void i(String str) {
        z65.h(str, "<set-?>");
        this.a = str;
    }

    public final void j(int i) {
        this.c = i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        boolean z = this.d;
        return "PhotoPreviewVO(uploadId=" + str + ", photoPath=" + str2 + ", uploadPercents=" + i + ", containsUploadFailure=" + z + ")";
    }

    public /* synthetic */ q58(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
