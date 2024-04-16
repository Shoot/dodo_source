package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreditCardExpiryInputValidator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J8\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010&\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006*"}, d2 = {"Lt22;", "Lz35;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "", "b", "a", KustoStorage.KustoTable.COLUMN_SOURCE, "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "I", c.a, "()I", "setMonth", "(I)V", "month", DateTokenConverter.CONVERTER_KEY, "setYear", "year", "Z", "getShouldSkipExpiryValidation", "()Z", e.a, "(Z)V", "shouldSkipExpiryValidation", "fullLength", "<init>", "(II)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: t22  reason: default package */
/* loaded from: classes4.dex */
public final class t22 implements z35 {
    private int a;
    private int b;
    private boolean c;
    private boolean d;

    public t22(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.z35
    public boolean a() {
        Date date = new Date();
        int year = date.getYear();
        int i = year + 1900;
        int month = date.getMonth() + 1;
        int i2 = this.a;
        if (i2 >= 1 && 12 >= i2) {
            if (this.c) {
                return true;
            }
            int i3 = this.b;
            if (i3 <= year + 1915) {
                if (i3 > i) {
                    return true;
                }
                if (i3 == i && i2 >= month) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean z;
        z65.h(editable, Image.TYPE_SMALL);
        if (editable.length() >= 5) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        Date b = qza.b(editable.toString());
        if (b == null) {
            return;
        }
        this.a = b.getMonth() + 1;
        int year = b.getYear();
        this.b = year;
        if (year < 1900) {
            this.b = year + 1900;
        }
    }

    @Override // defpackage.z35
    public boolean b() {
        return this.d;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        z65.h(charSequence, Image.TYPE_SMALL);
        this.a = 0;
        this.b = 0;
        this.d = false;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        z65.h(charSequence, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(spanned, "dest");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i3 == 0 && spannableStringBuilder.length() > 0 && z65.j(49, spannableStringBuilder.charAt(0)) < 0 && z65.j(spannableStringBuilder.charAt(0), 57) <= 0) {
            spannableStringBuilder.insert(0, (CharSequence) "0");
            i2++;
        }
        int i6 = i4 - i3;
        if (i3 - i6 <= 2 && (i3 + i2) - i6 >= 2 && ((i5 = 2 - i3) == i2 || (i5 >= 0 && i5 <= i2 - 1 && spannableStringBuilder.charAt(i5) != '/'))) {
            spannableStringBuilder.insert(i5, (CharSequence) "/");
            i2++;
        }
        String spannableStringBuilder2 = new SpannableStringBuilder(spanned).replace(i3, i4, (CharSequence) spannableStringBuilder, i, i2).toString();
        z65.g(spannableStringBuilder2, "toString(...)");
        if (spannableStringBuilder2.length() > 0 && (z65.j(spannableStringBuilder2.charAt(0), 48) < 0 || z65.j(49, spannableStringBuilder2.charAt(0)) < 0)) {
            return "";
        }
        if (spannableStringBuilder2.length() >= 2) {
            if (spannableStringBuilder2.charAt(0) != '0' && z65.j(spannableStringBuilder2.charAt(1), 50) > 0) {
                return "";
            }
            if (spannableStringBuilder2.charAt(0) == '0' && spannableStringBuilder2.charAt(1) == '0') {
                return "";
            }
        }
        if (spannableStringBuilder2.length() > 5) {
            return "";
        }
        return spannableStringBuilder;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        z65.h(charSequence, Image.TYPE_SMALL);
    }

    public /* synthetic */ t22(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
