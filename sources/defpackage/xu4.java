package defpackage;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageLoaderRequest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\tB/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\t\u0010\u001a¨\u0006\u001f"}, d2 = {"Lxu4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "b", "I", "()I", "placeholderResId", "Lzu4;", c.a, "Lzu4;", "()Lzu4;", "resultCallbacks", "Ltkb;", "Landroid/graphics/Bitmap;", "Ltkb;", "()Ltkb;", "imageTransformation", "<init>", "(Ljava/lang/String;ILzu4;Ltkb;)V", e.a, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xu4  reason: default package */
/* loaded from: classes.dex */
public final class xu4 {
    public static final a e = new a(null);
    private final String a;
    private final int b;
    private final zu4 c;
    private final tkb<Bitmap> d;

    /* compiled from: ImageLoaderRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxu4$a;", "", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xu4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xu4(String str, int i, zu4 zu4Var, tkb<Bitmap> tkbVar) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        z65.h(zu4Var, "resultCallbacks");
        this.a = str;
        this.b = i;
        this.c = zu4Var;
        this.d = tkbVar;
    }

    public final tkb<Bitmap> a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final zu4 c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4)) {
            return false;
        }
        xu4 xu4Var = (xu4) obj;
        if (z65.c(this.a, xu4Var.a) && this.b == xu4Var.b && z65.c(this.c, xu4Var.c) && z65.c(this.d, xu4Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31;
        tkb<Bitmap> tkbVar = this.d;
        if (tkbVar == null) {
            hashCode = 0;
        } else {
            hashCode = tkbVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        zu4 zu4Var = this.c;
        tkb<Bitmap> tkbVar = this.d;
        return "ImageLoaderRequest(url=" + str + ", placeholderResId=" + i + ", resultCallbacks=" + zu4Var + ", imageTransformation=" + tkbVar + ")";
    }
}
