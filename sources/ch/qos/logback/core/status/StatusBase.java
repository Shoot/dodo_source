package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList(0);
    List<Status> childrenList;
    long date;
    int level;
    final String message;
    final Object origin;
    Throwable throwable;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StatusBase(int i, String str, Object obj) {
        this(i, str, obj, null);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        try {
            if (status != null) {
                if (this.childrenList == null) {
                    this.childrenList = new ArrayList();
                }
                this.childrenList.add(status);
            } else {
                throw new NullPointerException("Null values are not valid Status.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusBase statusBase = (StatusBase) obj;
        if (this.level != statusBase.level) {
            return false;
        }
        String str = this.message;
        String str2 = statusBase.message;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.date);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i;
        i = this.level;
        Iterator<Status> it = iterator();
        while (it.hasNext()) {
            int effectiveLevel = it.next().getEffectiveLevel();
            if (effectiveLevel > i) {
                i = effectiveLevel;
            }
        }
        return i;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.origin;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.throwable;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean hasChildren() {
        boolean z;
        List<Status> list = this.childrenList;
        if (list != null) {
            if (list.size() > 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int hashCode;
        int i = (this.level + 31) * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List<Status> list = this.childrenList;
        if (list != null) {
            return list.iterator();
        }
        return EMPTY_LIST.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List<Status> list = this.childrenList;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getEffectiveLevel()
            if (r1 == 0) goto L1b
            r2 = 1
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L12
            goto L1e
        L12:
            java.lang.String r1 = "ERROR"
        L14:
            r0.append(r1)
            goto L1e
        L18:
            java.lang.String r1 = "WARN"
            goto L14
        L1b:
            java.lang.String r1 = "INFO"
            goto L14
        L1e:
            java.lang.Object r1 = r3.origin
            if (r1 == 0) goto L31
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.origin
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L31:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.message
            r0.append(r2)
            java.lang.Throwable r2 = r3.throwable
            if (r2 == 0) goto L47
            r0.append(r1)
            java.lang.Throwable r1 = r3.throwable
            r0.append(r1)
        L47:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.status.StatusBase.toString():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StatusBase(int i, String str, Object obj, Throwable th) {
        this.level = i;
        this.message = str;
        this.origin = obj;
        this.throwable = th;
        this.date = System.currentTimeMillis();
    }
}
