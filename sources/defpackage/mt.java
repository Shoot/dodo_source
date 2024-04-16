package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AssistantGeneratorRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\f¨\u0006\""}, d2 = {"Lmt;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMenuItemId", "()Ljava/lang/String;", "menuItemId", "b", "getStateId", "stateId", c.a, "getMood", "mood", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getWishes", "()Ljava/util/List;", "wishes", e.a, "getPreferences", "preferences", "f", "getPreferredImageFormat", "preferredImageFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mt  reason: default package */
/* loaded from: classes2.dex */
public final class mt {
    @uca("menuItemId")
    private final String a;
    @uca("stateId")
    private final String b;
    @uca("mood")
    private final String c;
    @uca("wishes")
    private final List<String> d;
    @uca("preferences")
    private final List<String> e;
    @uca("preferredImageFormat")
    private final String f;

    public mt(String str, String str2, String str3, List<String> list, List<String> list2, String str4) {
        z65.h(str, "menuItemId");
        z65.h(str2, "stateId");
        z65.h(str4, "preferredImageFormat");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
        this.f = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        if (z65.c(this.a, mtVar.a) && z65.c(this.b, mtVar.b) && z65.c(this.c, mtVar.c) && z65.c(this.d, mtVar.d) && z65.c(this.e, mtVar.e) && z65.c(this.f, mtVar.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        List<String> list = this.d;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<String> list2 = this.e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((i3 + i) * 31) + this.f.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List<String> list = this.d;
        List<String> list2 = this.e;
        String str4 = this.f;
        return "AssistantGeneratorRequest(menuItemId=" + str + ", stateId=" + str2 + ", mood=" + str3 + ", wishes=" + list + ", preferences=" + list2 + ", preferredImageFormat=" + str4 + ")";
    }

    public /* synthetic */ mt(String str, String str2, String str3, List list, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, list2, (i & 32) != 0 ? "webp" : str4);
    }
}
