package defpackage;

import android.view.ViewStructure;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, d2 = {"Lt30;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "b", "num", "a", "id", "", "packageName", "typeName", "entryName", "", DateTokenConverter.CONVERTER_KEY, ElementGenerator.TEXT_ALIGN_LEFT, "top", "scrollX", "scrollY", "width", "height", c.a, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: t30  reason: default package */
/* loaded from: classes.dex */
public final class t30 {
    public static final t30 a = new t30();

    private t30() {
    }

    public final int a(ViewStructure viewStructure, int i) {
        int addChildCount;
        z65.h(viewStructure, "structure");
        addChildCount = viewStructure.addChildCount(i);
        return addChildCount;
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        ViewStructure newChild;
        z65.h(viewStructure, "structure");
        newChild = viewStructure.newChild(i);
        return newChild;
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        z65.h(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        z65.h(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
