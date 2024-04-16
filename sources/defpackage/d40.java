package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, d2 = {"Ld40;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "", "g", "a", MessageAttributes.TYPE, Image.TYPE_HIGH, "", "", "hints", "f", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", DateTokenConverter.CONVERTER_KEY, "b", c.a, e.a, "", "i", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d40  reason: default package */
/* loaded from: classes.dex */
public final class d40 {
    public static final d40 a = new d40();

    private d40() {
    }

    public final AutofillId a(ViewStructure viewStructure) {
        AutofillId autofillId;
        z65.h(viewStructure, "structure");
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    public final boolean b(AutofillValue autofillValue) {
        boolean isDate;
        z65.h(autofillValue, "value");
        isDate = autofillValue.isDate();
        return isDate;
    }

    public final boolean c(AutofillValue autofillValue) {
        boolean isList;
        z65.h(autofillValue, "value");
        isList = autofillValue.isList();
        return isList;
    }

    public final boolean d(AutofillValue autofillValue) {
        boolean isText;
        z65.h(autofillValue, "value");
        isText = autofillValue.isText();
        return isText;
    }

    public final boolean e(AutofillValue autofillValue) {
        boolean isToggle;
        z65.h(autofillValue, "value");
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        z65.h(viewStructure, "structure");
        z65.h(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        z65.h(viewStructure, "structure");
        z65.h(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void h(ViewStructure viewStructure, int i) {
        z65.h(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        CharSequence textValue;
        z65.h(autofillValue, "value");
        textValue = autofillValue.getTextValue();
        z65.g(textValue, "value.textValue");
        return textValue;
    }
}
