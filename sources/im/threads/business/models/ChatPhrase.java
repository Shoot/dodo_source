package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import kotlin.Metadata;
/* compiled from: ChatPhrase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lim/threads/business/models/ChatPhrase;", "Lim/threads/business/models/ChatItem;", "fileDescription", "Lim/threads/business/models/FileDescription;", "getFileDescription", "()Lim/threads/business/models/FileDescription;", "found", "", "getFound", "()Z", "setFound", "(Z)V", "id", "", "getId", "()Ljava/lang/String;", "phraseText", "getPhraseText", "quote", "Lim/threads/business/models/Quote;", "getQuote", "()Lim/threads/business/models/Quote;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChatPhrase extends ChatItem {

    /* compiled from: ChatPhrase.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static ModificationStateEnum modified(ChatPhrase chatPhrase) {
            return ChatItem.DefaultImpls.modified(chatPhrase);
        }
    }

    FileDescription getFileDescription();

    boolean getFound();

    String getId();

    String getPhraseText();

    Quote getQuote();

    void setFound(boolean z);
}
