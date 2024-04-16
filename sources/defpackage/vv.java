package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantSettingsDto.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvv;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lnu;", "a", "Ljava/util/List;", "()Ljava/util/List;", "moods", "Lcv;", "b", "preferences", "Lbx;", c.a, DateTokenConverter.CONVERTER_KEY, "wishes", "Ljava/lang/String;", "()Ljava/lang/String;", "successHint", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vv  reason: default package */
/* loaded from: classes2.dex */
public final class vv {
    @uca("moods")
    private final List<nu> a;
    @uca("preferences")
    private final List<cv> b;
    @uca("wishes")
    private final List<bx> c;
    @uca("successHint")
    private final String d;

    public final List<nu> a() {
        return this.a;
    }

    public final List<cv> b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final List<bx> d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        if (z65.c(this.a, vvVar.a) && z65.c(this.b, vvVar.b) && z65.c(this.c, vvVar.c) && z65.c(this.d, vvVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        List<nu> list = this.a;
        List<cv> list2 = this.b;
        List<bx> list3 = this.c;
        String str = this.d;
        return "AssistantSettingsDto(moods=" + list + ", preferences=" + list2 + ", wishes=" + list3 + ", successHint=" + str + ")";
    }
}
