package im.threads.business.models;

import com.dodopizza.persistence.entity.menu.MenuItemEntity;
import java.util.UUID;
import kotlin.Metadata;
/* compiled from: QuestionDTO.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006-"}, d2 = {"Lim/threads/business/models/QuestionDTO;", "", "()V", "correlationId", "", "getCorrelationId", "()Ljava/lang/String;", "setCorrelationId", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "phraseTimeStamp", "getPhraseTimeStamp", "setPhraseTimeStamp", "rate", "", "getRate", "()Ljava/lang/Integer;", "setRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scale", "getScale", "()I", "setScale", "(I)V", "sendingId", "getSendingId", "setSendingId", MenuItemEntity.TYPE_SIMPLE, "", "getSimple", "()Z", "setSimple", "(Z)V", "text", "getText", "setText", "generateCorrelationId", "", "hasRate", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionDTO {
    private String correlationId = "";
    private long id;
    private long phraseTimeStamp;
    private Integer rate;
    private int scale;
    private long sendingId;
    private boolean simple;
    private String text;

    public final void generateCorrelationId() {
        String uuid = UUID.randomUUID().toString();
        z65.g(uuid, "randomUUID().toString()");
        this.correlationId = uuid;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getPhraseTimeStamp() {
        return this.phraseTimeStamp;
    }

    public final Integer getRate() {
        return this.rate;
    }

    public final int getScale() {
        return this.scale;
    }

    public final long getSendingId() {
        return this.sendingId;
    }

    public final boolean getSimple() {
        return this.simple;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean hasRate() {
        if (this.rate != null) {
            return true;
        }
        return false;
    }

    public final void setCorrelationId(String str) {
        z65.h(str, "<set-?>");
        this.correlationId = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setPhraseTimeStamp(long j) {
        this.phraseTimeStamp = j;
    }

    public final void setRate(Integer num) {
        this.rate = num;
    }

    public final void setScale(int i) {
        this.scale = i;
    }

    public final void setSendingId(long j) {
        this.sendingId = j;
    }

    public final void setSimple(boolean z) {
        this.simple = z;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
