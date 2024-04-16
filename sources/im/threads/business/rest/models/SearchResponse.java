package im.threads.business.rest.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.MessageFromHistory;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SearchResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lim/threads/business/rest/models/SearchResponse;", "", "()V", RemoteMessageConst.Notification.CONTENT, "", "Lim/threads/business/models/MessageFromHistory;", "getContent", "()Ljava/util/List;", "setContent", "(Ljava/util/List;)V", "pages", "", "getPages", "()Ljava/lang/Integer;", "setPages", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "total", "getTotal", "setTotal", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchResponse {
    private List<MessageFromHistory> content;
    private Integer pages;
    private Integer total;

    public final List<MessageFromHistory> getContent() {
        return this.content;
    }

    public final Integer getPages() {
        return this.pages;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final void setContent(List<MessageFromHistory> list) {
        this.content = list;
    }

    public final void setPages(Integer num) {
        this.pages = num;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }
}
