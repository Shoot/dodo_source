package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Locality.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B=\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010 \u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u0010\u0010\f\u0082\u0001\u0001#¨\u0006$"}, d2 = {"Ldt5;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "id", "b", DateTokenConverter.CONVERTER_KEY, MessageAttributes.UUID, c.a, "getName", Action.NAME_ATTRIBUTE, LocalityEntity.FIELD_COUNTRY_CODE, e.a, "I", "()I", BonusActionEntity.ORDER, "f", "Z", "()Z", "isTop", "g", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "Lila;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dt5  reason: default package */
/* loaded from: classes4.dex */
public abstract class dt5 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;
    private final String g;

    public /* synthetic */ dt5(String str, String str2, String str3, String str4, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, z);
    }

    public final String a() {
        return this.d;
    }

    public String b() {
        return this.g;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(cls2, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.domain.locality.models.Locality");
        dt5 dt5Var = (dt5) obj;
        if (z65.c(this.a, dt5Var.a) && z65.c(this.c, dt5Var.c) && z65.c(this.d, dt5Var.d)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public final String getName() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    private dt5(String str, String str2, String str3, String str4, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = str3;
    }
}
