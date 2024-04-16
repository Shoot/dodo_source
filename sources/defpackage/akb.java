package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: InitData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lakb;", "", "", "component1", "component2", "messageUniqueKey", "buttonUniqueKey", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMessageUniqueKey", "()Ljava/lang/String;", "getButtonUniqueKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: akb  reason: default package */
/* loaded from: classes.dex */
public final class akb {
    @uca("buttonUniqueKey")
    private final String buttonUniqueKey;
    @uca("messageUniqueKey")
    private final String messageUniqueKey;

    public akb(String str, String str2) {
        z65.h(str, "messageUniqueKey");
        this.messageUniqueKey = str;
        this.buttonUniqueKey = str2;
    }

    public static /* synthetic */ akb copy$default(akb akbVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = akbVar.messageUniqueKey;
        }
        if ((i & 2) != 0) {
            str2 = akbVar.buttonUniqueKey;
        }
        return akbVar.copy(str, str2);
    }

    public final String component1() {
        return this.messageUniqueKey;
    }

    public final String component2() {
        return this.buttonUniqueKey;
    }

    public final akb copy(String str, String str2) {
        z65.h(str, "messageUniqueKey");
        return new akb(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        if (z65.c(this.messageUniqueKey, akbVar.messageUniqueKey) && z65.c(this.buttonUniqueKey, akbVar.buttonUniqueKey)) {
            return true;
        }
        return false;
    }

    public final String getButtonUniqueKey() {
        return this.buttonUniqueKey;
    }

    public final String getMessageUniqueKey() {
        return this.messageUniqueKey;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.messageUniqueKey.hashCode() * 31;
        String str = this.buttonUniqueKey;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "TrackClickData(messageUniqueKey=" + this.messageUniqueKey + ", buttonUniqueKey=" + this.buttonUniqueKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
