package im.threads.business.models;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.models.ChatItem;
import im.threads.business.models.enums.ModificationStateEnum;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: ScheduleInfo.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020\u00042\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0006R\u001c\u0010(\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0016R\u0016\u00102\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000fR\u001a\u00104\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010/¨\u0006A"}, d2 = {"Lim/threads/business/models/ScheduleInfo;", "Lim/threads/business/models/ChatItem;", "()V", "active", "", "getActive", "()Z", "setActive", "(Z)V", "currentUtcTime", "", "getCurrentUtcTime", "()J", "date", "getDate", "()Ljava/lang/Long;", "setDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endTime", "Ljava/util/Date;", "getEndTime", "()Ljava/util/Date;", "id", "getId", "setId", "intervals", "", "Lim/threads/business/models/ScheduleInfo$WeekDaySchedule;", "getIntervals$threads_release", "()Ljava/util/List;", "isChatWorking", RemoteMessageConst.NOTIFICATION, "", "getNotification", "()Ljava/lang/String;", "setNotification", "(Ljava/lang/String;)V", "sendDuringInactive", "getSendDuringInactive", "serverTime", "getServerTime", "setServerTime", "(Ljava/util/Date;)V", "serverTimeDiff", "getServerTimeDiff", "setServerTimeDiff", "(J)V", "startTime", "getStartTime", "threadId", "getThreadId", "timeStamp", "getTimeStamp", "setTimeStamp", "calculateServerTimeDiff", "", "equals", "other", "", "hashCode", "", "isTheSameItem", "otherItem", "WeekDaySchedule", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScheduleInfo implements ChatItem {
    private boolean active;
    private Long date;
    private final Date endTime;
    private Long id;
    private final List<WeekDaySchedule> intervals;
    private String notification;
    private final boolean sendDuringInactive;
    private Date serverTime;
    private long serverTimeDiff;
    private final Date startTime;
    private long timeStamp;

    /* compiled from: ScheduleInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lim/threads/business/models/ScheduleInfo$WeekDaySchedule;", "", "id", "", "weekDay", "startTime", "", "endTime", "(IIJJ)V", "getId", "()I", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class WeekDaySchedule {
        private final long endTime;
        private final int id;
        private final long startTime;
        private final int weekDay;

        public WeekDaySchedule(int i, int i2, long j, long j2) {
            this.id = i;
            this.weekDay = i2;
            this.startTime = j;
            this.endTime = j2;
        }

        public final int getId() {
            return this.id;
        }

        public String toString() {
            int i = this.id;
            int i2 = this.weekDay;
            long j = this.startTime;
            long j2 = this.endTime;
            return "WeekDaySchedule{ id=" + i + ", weekDay=" + i2 + ", startTime=" + j + ", endTime=" + j2 + " }";
        }
    }

    private final long getCurrentUtcTime() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis();
    }

    public final void calculateServerTimeDiff() {
        Date date = this.serverTime;
        if (date != null) {
            this.serverTimeDiff = getCurrentUtcTime() - date.getTime();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z65.c(ScheduleInfo.class, obj.getClass())) {
            return false;
        }
        ScheduleInfo scheduleInfo = (ScheduleInfo) obj;
        if (this.sendDuringInactive == scheduleInfo.sendDuringInactive && getTimeStamp() == scheduleInfo.getTimeStamp() && this.active == scheduleInfo.active && this.serverTimeDiff == scheduleInfo.serverTimeDiff && p57.a(this.id, scheduleInfo.id) && p57.a(this.notification, scheduleInfo.notification) && p57.a(this.startTime, scheduleInfo.startTime) && p57.a(this.endTime, scheduleInfo.endTime) && p57.a(this.serverTime, scheduleInfo.serverTime)) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Long getDate() {
        return this.date;
    }

    public final Date getEndTime() {
        return this.endTime;
    }

    public final Long getId() {
        return this.id;
    }

    public final List<WeekDaySchedule> getIntervals$threads_release() {
        return this.intervals;
    }

    public final String getNotification() {
        return this.notification;
    }

    public final boolean getSendDuringInactive() {
        return this.sendDuringInactive;
    }

    public final Date getServerTime() {
        return this.serverTime;
    }

    public final long getServerTimeDiff() {
        return this.serverTimeDiff;
    }

    public final Date getStartTime() {
        return this.startTime;
    }

    @Override // im.threads.business.models.ChatItem
    public Long getThreadId() {
        return null;
    }

    @Override // im.threads.business.models.ChatItem
    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return p57.b(this.id, this.notification, Boolean.valueOf(this.sendDuringInactive), Long.valueOf(getTimeStamp()), this.startTime, this.endTime, this.serverTime, Boolean.valueOf(this.active), Long.valueOf(this.serverTimeDiff));
    }

    public final boolean isChatWorking() {
        if (this.startTime != null && this.endTime != null && this.serverTime != null) {
            long currentUtcTime = getCurrentUtcTime() - this.serverTimeDiff;
            if (this.active) {
                if (currentUtcTime < this.startTime.getTime()) {
                    return true;
                }
                if (currentUtcTime > this.startTime.getTime() && currentUtcTime < this.endTime.getTime()) {
                    return false;
                }
                this.endTime.getTime();
                return true;
            } else if (currentUtcTime < this.endTime.getTime()) {
                return false;
            } else {
                if (currentUtcTime > this.endTime.getTime() && currentUtcTime < this.startTime.getTime()) {
                    return true;
                }
                this.startTime.getTime();
                return true;
            }
        }
        return this.active;
    }

    @Override // im.threads.business.models.ChatItem
    public boolean isTheSameItem(ChatItem chatItem) {
        return chatItem instanceof ScheduleInfo;
    }

    @Override // im.threads.business.models.ChatItem
    public ModificationStateEnum modified() {
        return ChatItem.DefaultImpls.modified(this);
    }

    public final void setActive(boolean z) {
        this.active = z;
    }

    public final void setDate(Long l) {
        this.date = l;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setNotification(String str) {
        this.notification = str;
    }

    public final void setServerTime(Date date) {
        this.serverTime = date;
    }

    public final void setServerTimeDiff(long j) {
        this.serverTimeDiff = j;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }
}
