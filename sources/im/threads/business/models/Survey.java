package im.threads.business.models;

import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Survey.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eB_\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0015B9\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u0016J\b\u00106\u001a\u00020\fH\u0002J\u0006\u00107\u001a\u00020\u0000J\u0013\u00108\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\b\u0010;\u001a\u00020<H\u0016J(\u0010=\u001a\u00020\f2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010?H\u0002J\u0012\u0010A\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010C\u001a\u00020\u0004H\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006@RX\u0096\u000e¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001c\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001fR.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u001a\u0010.\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010'\"\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006D"}, d2 = {"Lim/threads/business/models/Survey;", "Lim/threads/business/models/ChatItem;", "Lim/threads/business/models/Hidable;", MessageAttributes.UUID, "", "surveySendingId", "", "hideAfter", "phraseTimeStamp", "messageState", "Lim/threads/business/models/MessageStatus;", "read", "", "displayMessage", "(Ljava/lang/String;JLjava/lang/Long;JLim/threads/business/models/MessageStatus;ZZ)V", "sendingId", "questions", "Ljava/util/ArrayList;", "Lim/threads/business/models/QuestionDTO;", "Lkotlin/collections/ArrayList;", "sentState", "(Ljava/lang/String;JLjava/util/ArrayList;Ljava/lang/Long;JZLim/threads/business/models/MessageStatus;Z)V", "(Ljava/lang/String;JJLim/threads/business/models/MessageStatus;ZZ)V", "<set-?>", "getHideAfter", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isCompleted", "()Z", "isDisplayMessage", "setDisplayMessage", "(Z)V", "isRead", "setRead", "getQuestions", "()Ljava/util/ArrayList;", "setQuestions", "(Ljava/util/ArrayList;)V", "getSendingId", "()J", "getSentState", "()Lim/threads/business/models/MessageStatus;", "setSentState", "(Lim/threads/business/models/MessageStatus;)V", "threadId", "getThreadId", "timeStamp", "getTimeStamp", "setTimeStamp", "(J)V", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "allQuestionsHasRate", "copy", "equals", "other", "", "hashCode", "", "isQuestionsEquals", "collection1", "", "collection2", "isTheSameItem", "otherItem", "toString", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Survey implements ChatItem, Hidable {
    private Long hideAfter;
    private boolean isDisplayMessage;
    private boolean isRead;
    private ArrayList<QuestionDTO> questions;
    private long sendingId;
    private MessageStatus sentState;
    private long timeStamp;
    private String uuid;

    public Survey(String str, long j, Long l, long j2, MessageStatus messageStatus, boolean z, boolean z2) {
        z65.h(messageStatus, "messageState");
        this.uuid = str;
        this.sendingId = j;
        this.hideAfter = l;
        setTimeStamp(j2);
        this.sentState = messageStatus;
        this.isRead = z;
        this.isDisplayMessage = z2;
    }

    private final boolean allQuestionsHasRate() {
        ArrayList<QuestionDTO> arrayList = this.questions;
        z65.e(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size && z; i++) {
            ArrayList<QuestionDTO> arrayList2 = this.questions;
            z65.e(arrayList2);
            z = arrayList2.get(i).hasRate();
        }
        return z;
    }

    private final boolean isQuestionsEquals(List<QuestionDTO> list, List<QuestionDTO> list2) {
        z65.e(list);
        int size = list.size();
        z65.e(list2);
        if (size != list2.size()) {
            return false;
        }
        boolean z = false;
        for (QuestionDTO questionDTO : list) {
            Iterator<QuestionDTO> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    QuestionDTO next = it.next();
                    if (next.getRate() == questionDTO.getRate() && z65.c(next.getText(), questionDTO.getText())) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                break;
            }
        }
        return z;
    }

    public final Survey copy() {
        return new Survey(this.uuid, this.sendingId, this.questions, getHideAfter(), getTimeStamp(), this.isDisplayMessage, this.sentState, this.isRead);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(Survey.class, obj.getClass())) {
            return false;
        }
        Survey survey = (Survey) obj;
        if (this.sendingId == survey.sendingId && getTimeStamp() == survey.getTimeStamp() && p57.a(this.questions, survey.questions) && p57.a(getHideAfter(), survey.getHideAfter()) && this.sentState == survey.sentState) {
            return true;
        }
        return false;
    }

    @Override // im.threads.business.models.Hidable
    public Long getHideAfter() {
        return this.hideAfter;
    }

    public final ArrayList<QuestionDTO> getQuestions() {
        return this.questions;
    }

    public final long getSendingId() {
        return this.sendingId;
    }

    public final MessageStatus getSentState() {
        return this.sentState;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return null;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return p57.b(Long.valueOf(this.sendingId), this.questions, getHideAfter(), Long.valueOf(getTimeStamp()), this.sentState);
    }

    public final boolean isCompleted() {
        MessageStatus messageStatus = this.sentState;
        if ((messageStatus == MessageStatus.SENT || messageStatus == MessageStatus.READ) && allQuestionsHasRate()) {
            return true;
        }
        return false;
    }

    public final boolean isDisplayMessage() {
        return this.isDisplayMessage;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        if (!(chatItem instanceof Survey)) {
            return false;
        }
        Survey survey = (Survey) chatItem;
        if (!p57.a(Long.valueOf(this.sendingId), Long.valueOf(survey.sendingId)) || !isQuestionsEquals(this.questions, survey.questions)) {
            return false;
        }
        return true;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public final void setDisplayMessage(boolean z) {
        this.isDisplayMessage = z;
    }

    public final void setQuestions(ArrayList<QuestionDTO> arrayList) {
        this.questions = arrayList;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setSentState(MessageStatus messageStatus) {
        z65.h(messageStatus, "<set-?>");
        this.sentState = messageStatus;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public String toString() {
        String str;
        String str2 = this.uuid;
        long j = this.sendingId;
        Long hideAfter = getHideAfter();
        boolean z = this.isDisplayMessage;
        MessageStatus messageStatus = this.sentState;
        boolean z2 = this.isRead;
        long timeStamp = getTimeStamp();
        Long threadId = getThreadId();
        ArrayList<QuestionDTO> arrayList = this.questions;
        if (arrayList != null) {
            str = arrayList.toString();
        } else {
            str = null;
        }
        return "Survey. uuid:\n = " + str2 + ", \nsendingId = " + j + ", \nhideAfter = " + hideAfter + ", \nisDisplayMessage = " + z + ", \nsentState = " + messageStatus + ", \nisRead = " + z2 + ", \ntimeStamp = " + timeStamp + ", \nthreadId = " + threadId + ", \nquestions = " + str;
    }

    public Survey(String str, long j, ArrayList<QuestionDTO> arrayList, Long l, long j2, boolean z, MessageStatus messageStatus, boolean z2) {
        z65.h(messageStatus, "sentState");
        this.uuid = str;
        this.sendingId = j;
        this.questions = arrayList;
        this.hideAfter = l;
        setTimeStamp(j2);
        this.isDisplayMessage = z;
        this.sentState = messageStatus;
        this.isRead = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Survey(String str, long j, long j2, MessageStatus messageStatus, boolean z, boolean z2) {
        this(str, j, null, j2, messageStatus, z, z2);
        z65.h(messageStatus, "messageState");
    }
}
