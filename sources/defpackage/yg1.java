package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
/* compiled from: ComboCustomizationRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lyg1;", "Lxg1;", "", "comboMenuItemId", "", "comboSlotProductsIds", "", c.a, "a", "b", "Ljava/util/concurrent/ConcurrentMap;", "", "Ljava/util/concurrent/ConcurrentMap;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yg1  reason: default package */
/* loaded from: classes4.dex */
public final class yg1 implements xg1 {
    private final ConcurrentMap<String, List<String>> a = new ConcurrentHashMap();

    @Override // defpackage.xg1
    public Collection<String> a(String str) {
        z65.h(str, "comboMenuItemId");
        List<String> list = this.a.get(str);
        if (list == null) {
            list = kc1.l();
        }
        return list;
    }

    @Override // defpackage.xg1
    public void b() {
        this.a.clear();
    }

    @Override // defpackage.xg1
    public void c(String str, Collection<String> collection) {
        z65.h(str, "comboMenuItemId");
        z65.h(collection, "comboSlotProductsIds");
        this.a.put(str, new ArrayList(collection));
    }
}
