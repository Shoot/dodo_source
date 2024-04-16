package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: ComboSlotProductSelector.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0003\u0010\r¨\u0006\u0012"}, d2 = {"Luna;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "preferredSlotProductId", c.a, "previouslySelectedProductId", "", "Ljava/util/Collection;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Collection;", "productIdsStopList", "hotAndReadyList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: una  reason: default package */
/* loaded from: classes4.dex */
public final class una {
    private final String a;
    private final String b;
    private final Collection<String> c;
    private final Collection<String> d;

    public una(String str, String str2, Collection<String> collection, Collection<String> collection2) {
        z65.h(collection, "productIdsStopList");
        z65.h(collection2, "hotAndReadyList");
        this.a = str;
        this.b = str2;
        this.c = collection;
        this.d = collection2;
    }

    public final Collection<String> a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final Collection<String> d() {
        return this.c;
    }
}
