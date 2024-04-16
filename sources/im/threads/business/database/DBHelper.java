package im.threads.business.database;

import im.threads.business.models.ChatItem;
import im.threads.business.models.FileDescription;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DBHelper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&R\u001c\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lim/threads/business/database/DBHelper;", "", "allFileDescriptions", "", "Lim/threads/business/models/FileDescription;", "getAllFileDescriptions", "()Ljava/util/List;", "cleanDatabase", "", "getChatItems", "Lim/threads/business/models/ChatItem;", "offset", "", "limit", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DBHelper {
    void cleanDatabase();

    List<FileDescription> getAllFileDescriptions();

    List<ChatItem> getChatItems(int i, int i2);
}
