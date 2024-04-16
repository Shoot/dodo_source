package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lbk8;", "", "", "value", "", "a", "", "b", c.a, DateTokenConverter.CONVERTER_KEY, "", "Ljava/util/List;", StatisticManager.LIST, "<init>", "(Ljava/util/List;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bk8  reason: default package */
/* loaded from: classes.dex */
public final class bk8 {
    private final List<Integer> a;

    public bk8(List<Integer> list) {
        z65.h(list, StatisticManager.LIST);
        this.a = list;
    }

    public final void a(int i) {
        List<Integer> list;
        if (!this.a.isEmpty()) {
            if (this.a.get(0).intValue() != i) {
                if (this.a.get(list.size() - 1).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.a.size();
        this.a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = this.a.get(i2).intValue();
            if (i <= intValue) {
                break;
            }
            this.a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.a.set(size, Integer.valueOf(i));
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    public final int c() {
        Object Z;
        Z = sc1.Z(this.a);
        return ((Number) Z).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d() {
        boolean z;
        Object k0;
        int intValue;
        if (this.a.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int intValue2 = this.a.get(0).intValue();
            while ((!this.a.isEmpty()) && this.a.get(0).intValue() == intValue2) {
                List<Integer> list = this.a;
                k0 = sc1.k0(list);
                list.set(0, k0);
                List<Integer> list2 = this.a;
                list2.remove(list2.size() - 1);
                int size = this.a.size();
                int size2 = this.a.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = this.a.get(i).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = this.a.get(i3).intValue();
                    if (i2 < size && (intValue = this.a.get(i2).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.a.set(i, Integer.valueOf(intValue));
                            this.a.set(i2, Integer.valueOf(intValue3));
                            i = i2;
                        }
                    } else if (intValue4 > intValue3) {
                        this.a.set(i, Integer.valueOf(intValue4));
                        this.a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                }
            }
            return intValue2;
        }
        tn1.w("Set is empty".toString());
        throw new KotlinNothingValueException();
    }

    public /* synthetic */ bk8(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
