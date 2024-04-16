package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CatalogProductListResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lft0;", "", "", "toString", "Lzk8;", "processingStatus", "Lzk8;", "getProcessingStatus", "()Lzk8;", "", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lzk8;Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ft0  reason: default package */
/* loaded from: classes.dex */
public class ft0 {
    @uca("items")
    private final List<Object> items;
    @uca("processingStatus")
    private final zk8 processingStatus;

    public ft0() {
        this(null, null, 3, null);
    }

    public final List<Object> getItems() {
        return this.items;
    }

    public final zk8 getProcessingStatus() {
        return this.processingStatus;
    }

    public String toString() {
        return "CatalogProductListResponse(processingStatus=" + this.processingStatus + ", items=" + this.items + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ft0(zk8 zk8Var, List<Object> list) {
        this.processingStatus = zk8Var;
        this.items = list;
    }

    public /* synthetic */ ft0(zk8 zk8Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : zk8Var, (i & 2) != 0 ? null : list);
    }
}
