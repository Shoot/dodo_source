package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: SegmentationCheckRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lqt4;", "", "", "component1", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getExternalId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qt4  reason: default package */
/* loaded from: classes.dex */
public final class qt4 {
    @uca(ShoppingInfoEntity.FIELD_EXTERNAL_ID)
    private final String externalId;

    public qt4(String str) {
        this.externalId = str;
    }

    public static /* synthetic */ qt4 copy$default(qt4 qt4Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qt4Var.externalId;
        }
        return qt4Var.copy(str);
    }

    public final String component1() {
        return this.externalId;
    }

    public final qt4 copy(String str) {
        return new qt4(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qt4) && z65.c(this.externalId, ((qt4) obj).externalId)) {
            return true;
        }
        return false;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public int hashCode() {
        String str = this.externalId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IdsRequest(externalId=" + this.externalId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
