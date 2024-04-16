package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Locality.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lila;", "Ldt5;", "Ljava/io/Serializable;", "", "id", MessageAttributes.UUID, Action.NAME_ATTRIBUTE, LocalityEntity.FIELD_COUNTRY_CODE, "", BonusActionEntity.ORDER, "", "isTop", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ila  reason: default package */
/* loaded from: classes4.dex */
public final class ila extends dt5 implements Serializable {
    public /* synthetic */ ila(String str, String str2, String str3, String str4, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? Integer.MAX_VALUE : i, (i2 & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ila(String str, String str2, String str3, String str4, int i, boolean z) {
        super(str, str2, str3, str4, i, z, null);
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, LocalityEntity.FIELD_COUNTRY_CODE);
    }
}
