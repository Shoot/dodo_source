package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InAppConfigResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\u0006\u001a\u00020\u00002\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lk54;", "", "", "Lns7;", "component1", "variants", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: k54  reason: default package */
/* loaded from: classes.dex */
public final class k54 {
    @uca("variants")
    private final List<ns7> variants;

    /* JADX WARN: Multi-variable type inference failed */
    public k54(List<? extends ns7> list) {
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k54 copy$default(k54 k54Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = k54Var.variants;
        }
        return k54Var.copy(list);
    }

    public final List<ns7> component1() {
        return this.variants;
    }

    public final k54 copy(List<? extends ns7> list) {
        return new k54(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k54) && z65.c(this.variants, ((k54) obj).variants)) {
            return true;
        }
        return false;
    }

    public final List<ns7> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        List<ns7> list = this.variants;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FormDto(variants=" + this.variants + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
