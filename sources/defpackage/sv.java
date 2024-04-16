package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantSettings.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001c"}, d2 = {"Lsv;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lju;", "a", "Ljava/util/List;", "()Ljava/util/List;", "moods", "Lav;", "b", "preferences", "Lzw;", c.a, DateTokenConverter.CONVERTER_KEY, "wishes", "Ljava/lang/String;", "()Ljava/lang/String;", "successHint", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sv  reason: default package */
/* loaded from: classes2.dex */
public final class sv implements Serializable {
    private final List<ju> a;
    private final List<av> b;
    private final List<zw> c;
    private final String d;

    public sv(List<ju> list, List<av> list2, List<zw> list3, String str) {
        z65.h(list, "moods");
        z65.h(list2, "preferences");
        z65.h(list3, "wishes");
        z65.h(str, "successHint");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = str;
    }

    public final List<ju> a() {
        return this.a;
    }

    public final List<av> b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final List<zw> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv)) {
            return false;
        }
        sv svVar = (sv) obj;
        if (z65.c(this.a, svVar.a) && z65.c(this.b, svVar.b) && z65.c(this.c, svVar.c) && z65.c(this.d, svVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        List<ju> list = this.a;
        List<av> list2 = this.b;
        List<zw> list3 = this.c;
        String str = this.d;
        return "AssistantSettings(moods=" + list + ", preferences=" + list2 + ", wishes=" + list3 + ", successHint=" + str + ")";
    }
}
