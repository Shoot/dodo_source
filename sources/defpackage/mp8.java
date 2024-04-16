package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: PromoActionVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"Lmp8;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", c.a, "()I", "title", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "text", "drawable", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", RemoteMessageConst.Notification.URL, "<init>", "(ILjava/lang/Integer;ILjava/lang/String;)V", "(IILjava/lang/String;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mp8  reason: default package */
/* loaded from: classes.dex */
public final class mp8 {
    private final int a;
    private final Integer b;
    private final int c;
    private final String d;

    public mp8(int i, Integer num, int i2, String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = str;
    }

    public final int a() {
        return this.c;
    }

    public final Integer b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp8)) {
            return false;
        }
        mp8 mp8Var = (mp8) obj;
        if (this.a == mp8Var.a && z65.c(this.b, mp8Var.b) && this.c == mp8Var.c && z65.c(this.d, mp8Var.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = this.a * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((i + hashCode) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        int i = this.a;
        Integer num = this.b;
        int i2 = this.c;
        String str = this.d;
        return "PromoActionVO(title=" + i + ", text=" + num + ", drawable=" + i2 + ", url=" + str + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mp8(int i, int i2, String str) {
        this(i, null, i2, str);
        z65.h(str, RemoteMessageConst.Notification.URL);
    }
}
