package im.threads.business.secureDatabase;

import im.threads.business.extensions.MutableLazy;
import im.threads.business.models.ChatItem;
import im.threads.business.models.Survey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lim/threads/business/models/ChatItem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseHolder$getChatItems$1 extends ej5 implements Function0<List<ChatItem>> {
    final /* synthetic */ int $limit;
    final /* synthetic */ int $offset;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseHolder$getChatItems$1(DatabaseHolder databaseHolder, int i, int i2) {
        super(0);
        this.this$0 = databaseHolder;
        this.$offset = i;
        this.$limit = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<ChatItem> invoke() {
        MutableLazy mutableLazy;
        List<ChatItem> I0;
        MutableLazy mutableLazy2;
        MutableLazy mutableLazy3;
        mutableLazy = this.this$0.myOpenHelper;
        I0 = sc1.I0(((ThreadsDbHelper) mutableLazy.getValue()).getChatItems(this.$offset, this.$limit));
        mutableLazy2 = this.this$0.myOpenHelper;
        mutableLazy2.reset();
        ArrayList<Survey> arrayList = new ArrayList();
        ArrayList<Survey> arrayList2 = new ArrayList();
        for (Object obj : I0) {
            if (obj instanceof Survey) {
                arrayList2.add(obj);
            }
        }
        DatabaseHolder databaseHolder = this.this$0;
        for (Survey survey : arrayList2) {
            mutableLazy3 = databaseHolder.myOpenHelper;
            ChatItem chatItemByCorrelationId = ((ThreadsDbHelper) mutableLazy3.getValue()).getChatItemByCorrelationId(survey.getUuid());
            Survey survey2 = chatItemByCorrelationId instanceof Survey ? (Survey) chatItemByCorrelationId : null;
            if (survey2 != null) {
                arrayList.add(survey2);
            }
        }
        for (Survey survey3 : arrayList) {
            Iterator<ChatItem> it = I0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                ChatItem next = it.next();
                if ((next instanceof Survey) && ((Survey) next).getSendingId() == survey3.getSendingId()) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                I0.set(i, survey3);
            }
        }
        return I0;
    }
}
