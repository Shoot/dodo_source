package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LegalDocumentsData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lqo5;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lwo5;", "a", "Ljava/util/List;", "()Ljava/util/List;", "legalInformationList", "<init>", "(Ljava/util/List;)V", "auth_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qo5  reason: default package */
/* loaded from: classes.dex */
public final class qo5 implements Serializable {
    private final List<wo5> a;

    public qo5(List<wo5> list) {
        z65.h(list, "legalInformationList");
        this.a = list;
    }

    public final List<wo5> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qo5) && z65.c(this.a, ((qo5) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List<wo5> list = this.a;
        return "LegalDocumentsData(legalInformationList=" + list + ")";
    }
}
