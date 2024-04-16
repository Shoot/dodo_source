package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CreditCardNumberInputValidator.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b/\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J8\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0016R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b*\u0010(R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lu22;", "Lz35;", "", "digits", "Lwp0;", c.a, "Landroid/text/Editable;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "afterTextChanged", "", Image.TYPE_SMALL, "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "", "b", "a", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "setNumberString", "(Ljava/lang/String;)V", "numberString", "Lyvb;", "Lyvb;", "validator", "", "[I", "getAMEX_SPACER", "()[I", "AMEX_SPACER", "getNORMAL_SPACER", "NORMAL_SPACER", e.a, "I", "spacerToDelete", "<init>", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: u22  reason: default package */
/* loaded from: classes4.dex */
public final class u22 implements z35 {
    private String a;
    private final yvb b;
    private final int[] c;
    private final int[] d;
    private int e;

    public u22(String str) {
        z65.h(str, "numberString");
        this.a = str;
        this.b = new m36();
        this.c = new int[]{4, 11};
        this.d = new int[]{4, 9, 14};
    }

    private final wp0 c(String str) {
        return yp0.a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN, SYNTHETIC] */
    @Override // defpackage.z35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.a
            wp0 r0 = r5.c(r0)
            java.lang.String r0 = r0.getCode()
            java.lang.String r1 = "VISA"
            boolean r0 = defpackage.z65.c(r0, r1)
            if (r0 == 0) goto L25
            java.lang.String r0 = r5.a
            int r0 = r0.length()
            r1 = 13
            if (r0 != r1) goto L25
            yvb r0 = r5.b
            java.lang.String r1 = r5.a
            boolean r0 = r0.a(r1)
            goto L84
        L25:
            java.lang.String r0 = r5.a
            wp0 r0 = r5.c(r0)
            java.lang.String r0 = r0.getCode()
            java.lang.String r1 = "MAESTRO"
            boolean r0 = defpackage.z65.c(r0, r1)
            r1 = 1
            r2 = 16
            r3 = 0
            if (r0 != 0) goto L77
            java.lang.String r0 = r5.a
            wp0 r0 = r5.c(r0)
            java.lang.String r0 = r0.getCode()
            java.lang.String r4 = "MIR"
            boolean r0 = defpackage.z65.c(r0, r4)
            if (r0 == 0) goto L4e
            goto L77
        L4e:
            java.lang.String r0 = r5.a
            wp0 r0 = r5.c(r0)
            int r0 = r0.U()
            r4 = -1
            if (r0 != r4) goto L67
            java.lang.String r0 = r5.a
            int r0 = r0.length()
            if (r0 <= r2) goto L65
        L63:
            r0 = 1
            goto L84
        L65:
            r0 = 0
            goto L84
        L67:
            boolean r0 = r5.b()
            if (r0 != 0) goto L6e
            goto L65
        L6e:
            yvb r0 = r5.b
            java.lang.String r1 = r5.a
            boolean r0 = r0.a(r1)
            goto L84
        L77:
            java.lang.String r0 = r5.a
            int r0 = r0.length()
            if (r2 > r0) goto L65
            r2 = 20
            if (r0 >= r2) goto L65
            goto L63
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u22.a():boolean");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        z65.h(editable, KustoStorage.KustoTable.COLUMN_SOURCE);
        String d = qza.d(editable.toString());
        this.a = d;
        int U = c(d).U();
        if (U == -1) {
            return;
        }
        int i = this.e;
        int i2 = 0;
        if (i > 1) {
            int i3 = i - 1;
            this.e = 0;
            if (i > i3) {
                editable.delete(i3, i);
            }
        }
        while (i2 < editable.length()) {
            char charAt = editable.charAt(i2);
            if ((U != 15 || (i2 != 4 && i2 != 11)) && ((U != 16 && U != 14) || (i2 != 4 && i2 != 9 && i2 != 14))) {
                if (charAt == ' ') {
                    editable.delete(i2, i2 + 1);
                    i2--;
                }
            } else if (charAt != ' ') {
                editable.insert(i2, " ");
            }
            i2++;
        }
    }

    @Override // defpackage.z35
    public boolean b() {
        if (this.a.length() <= 0 || c(this.a).U() != this.a.length()) {
            return false;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        z65.h(charSequence, Image.TYPE_SMALL);
    }

    public final String d() {
        return this.a;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int[] iArr;
        int i5;
        z65.h(charSequence, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(spanned, "dest");
        String spannableStringBuilder = new SpannableStringBuilder(spanned).replace(i3, i4, charSequence, i, i2).toString();
        z65.g(spannableStringBuilder, "toString(...)");
        String d = qza.d(spannableStringBuilder);
        wp0 c = c(d);
        int U = c.U();
        if (c.U() == -1) {
            if (d.length() > 19) {
                return "";
            }
            return charSequence;
        } else if (d.length() > U) {
            return "";
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            if (U == 15) {
                iArr = this.c;
            } else {
                iArr = this.d;
            }
            int i6 = i4 - i3;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (charSequence.length() == 0 && i3 == iArr[i7] && spanned.charAt(i3) == ' ') {
                    this.e = iArr[i7];
                }
                int i8 = i3 - i6;
                int i9 = iArr[i7];
                if (i8 <= i9 && (i3 + i2) - i6 >= i9 && ((i5 = i9 - i3) == i2 || (i5 >= 0 && i5 <= i2 - 1 && spannableStringBuilder2.charAt(i5) != ' '))) {
                    spannableStringBuilder2.insert(i5, (CharSequence) " ");
                    i2++;
                }
            }
            return spannableStringBuilder2;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        z65.h(charSequence, Image.TYPE_SMALL);
    }

    public /* synthetic */ u22(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
