package defpackage;

import kotlin.Metadata;
/* compiled from: TokenDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lpib;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "<init>", "(Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pib  reason: default package */
/* loaded from: classes.dex */
public final class pib {
    @uca("token")
    private final String a;

    public pib(String str) {
        z65.h(str, "token");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pib) && z65.c(this.a, ((pib) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String str = this.a;
        return "TokenDto(token=" + str + ")";
    }
}
