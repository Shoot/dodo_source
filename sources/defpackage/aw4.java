package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: ImageVector.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002H\u0002¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", "f", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", e.a, "(Ljava/util/ArrayList;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: aw4  reason: default package */
/* loaded from: classes.dex */
public final class aw4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T e(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean f(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
